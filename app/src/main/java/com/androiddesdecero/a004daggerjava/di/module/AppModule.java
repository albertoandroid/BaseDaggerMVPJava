package com.androiddesdecero.a004daggerjava.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

//Los modulos son los proveedores de dependencias
@Module
public class AppModule {

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

    /*
    Exponer Session Manager al grafo
     */

    //Exponer Activities al grafo

}

