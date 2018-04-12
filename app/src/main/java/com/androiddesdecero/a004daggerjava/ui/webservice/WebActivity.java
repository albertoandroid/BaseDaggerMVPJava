package com.androiddesdecero.a004daggerjava.ui.webservice;

import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.a004daggerjava.R;
import com.androiddesdecero.a004daggerjava.api.VideosApiService;

import com.androiddesdecero.a004daggerjava.di.component.DaggerActivityComponent;
import com.androiddesdecero.a004daggerjava.di.component.DaggerNetworkComponent;
import com.androiddesdecero.a004daggerjava.di.component.NetworkComponent;
import com.androiddesdecero.a004daggerjava.di.module.ActivityModule;
import com.androiddesdecero.a004daggerjava.di.module.NetworkModule;
import com.androiddesdecero.a004daggerjava.model.Video;
import com.androiddesdecero.a004daggerjava.ui.Utils;
import com.androiddesdecero.a004daggerjava.ui.base.BaseApplication;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WebActivity extends AppCompatActivity {

    @Named("misvideos")@Inject
    public VideosApiService mVideosApi;

    private Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        utils = new Utils(getApplicationContext());
        utils.getVideos();

        //((BaseApplication)getApplication()).getAppComponent().inject(this);

        /*
        DaggerNetworkComponent.builder()
                .networkModule(new NetworkModule())
                .appComponent(BaseApplication.get(this).getAppComponent())
                .build()
                .inject(this);
        getVideos();
        */
    }

    public void getVideos() {

        Call<List<Video>> call = mVideosApi.getAllVideos();

        call.enqueue(new Callback<List<Video>>() {
            @Override
            public void onResponse(Call<List<Video>> call, Response<List<Video>> response) {
                if (response.isSuccessful()) {
                    List<Video> misVideos = response.body();
                    ContentValues values = new ContentValues();
                    for (int i = 0; i < misVideos.size(); i++) {
                        Log.d("pepe", misVideos.get(i).getTitulo());
                    }
                    //mPresenter.datadownloadedcorrectly();
                } else {
                    int sc = response.code();
                    switch (sc) {
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Video>> call, Throwable t) {
            }
        });

    }
}
