package com.androiddesdecero.a004daggerjava.ui.base;

import android.app.Application;
import android.content.Context;

import com.androiddesdecero.a004daggerjava.di.component.AppComponent;
import com.androiddesdecero.a004daggerjava.di.component.DaggerAppComponent;
import com.androiddesdecero.a004daggerjava.di.module.AppModule;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class BaseApplication extends Application {

    private AppComponent appComponent;

    public static BaseApplication get(Context context) {
        return (BaseApplication) context.getApplicationContext();
    }

    @Override public void onCreate() {
        super.onCreate();
        setupGraph();
    }

    private void setupGraph() {
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

