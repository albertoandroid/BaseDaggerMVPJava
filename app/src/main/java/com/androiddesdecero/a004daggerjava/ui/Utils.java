package com.androiddesdecero.a004daggerjava.ui;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.androiddesdecero.a004daggerjava.api.VideosApiService;
import com.androiddesdecero.a004daggerjava.di.component.DaggerNetworkComponent;
import com.androiddesdecero.a004daggerjava.di.module.NetworkModule;
import com.androiddesdecero.a004daggerjava.model.Video;
import com.androiddesdecero.a004daggerjava.ui.base.BaseApplication;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class Utils {

    @Named("misvideos")@Inject
    public VideosApiService mVideosApi;

    public Utils(Context context){
        DaggerNetworkComponent.builder()
                .networkModule(new NetworkModule())
                .appComponent(BaseApplication.get(context).getAppComponent())
                .build()
                .inject(this);
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
