package com.androiddesdecero.a004daggerjava.di.module;

import android.app.Application;
import android.content.Context;

import com.androiddesdecero.a004daggerjava.api.VideosApiService;
import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;

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

//Los modulos son los proveedores de dependencias
@Module
public class AppModule {

    private String mBaseUrl = "http://danzavientrefinal.asesoriavaldebebas.com/";

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    /*
    Exponer la application al grafo
     */
    @Provides
    @Singleton
    public Application provideApplication() {
        return application;
    }

    @Provides
    @Named("contextapp")
    @Singleton
    public Context provideApplicationContext() {
        return application;
    }


    @Singleton
    @Provides
    GsonConverterFactory provideGsonConverterFactory(){
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
        return gsonConverterFactory;
    }

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    RxJavaCallAdapterFactory providerRxJavaCallAdapterFactory(){
        return RxJavaCallAdapterFactory.create();
    }

    @Singleton
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

    @Singleton
    @Provides
    @Named("misvideos")
    VideosApiService provideApiService(@Named("videos")Retrofit retrofit){
        return retrofit.create(VideosApiService.class);
    }


    /*
    Exponer Session Manager al grafo
     */

    //Exponer Activities al grafo

}

