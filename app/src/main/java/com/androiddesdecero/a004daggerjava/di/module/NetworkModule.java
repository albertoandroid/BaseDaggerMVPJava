package com.androiddesdecero.a004daggerjava.di.module;

import android.app.Application;
import android.content.Context;

import com.androiddesdecero.a004daggerjava.api.VideosApiService;
import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.di.scope.PerNetwork;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Module
public class NetworkModule {
    private String mBaseUrl = "http://danzavientrefinal.asesoriavaldebebas.com/";

    public NetworkModule() {

    }

    /*
    Exponer la application al grafo
     */


    @PerNetwork
    @Provides
    GsonConverterFactory provideGsonConverterFactory(){
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
        return gsonConverterFactory;
    }

    @PerNetwork
    @Provides
    OkHttpClient provideOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    @PerNetwork
    @Provides
    RxJavaCallAdapterFactory providerRxJavaCallAdapterFactory(){
        return RxJavaCallAdapterFactory.create();
    }

    @PerNetwork
    @Provides
    @Named("videos")
    Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory converterFactory, RxJavaCallAdapterFactory adapterFactory){
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(adapterFactory)
                .client(client)
                .build();
    }

    @PerNetwork
    @Provides
    @Named("misvideos")
    VideosApiService provideApiService(@Named("videos")Retrofit retrofit){
        return retrofit.create(VideosApiService.class);
    }
}
