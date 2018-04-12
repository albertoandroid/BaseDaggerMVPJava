package com.androiddesdecero.a004daggerjava.di.component;

import com.androiddesdecero.a004daggerjava.di.module.ActivityModule;
import com.androiddesdecero.a004daggerjava.di.module.NetworkModule;
import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.di.scope.PerNetwork;
import com.androiddesdecero.a004daggerjava.ui.Utils;
import com.androiddesdecero.a004daggerjava.ui.webservice.WebActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@PerNetwork
@Component(dependencies = AppComponent.class, modules = NetworkModule.class)
public interface NetworkComponent {
    void inject(WebActivity webActivity);

    void inject(Utils utils);
}
