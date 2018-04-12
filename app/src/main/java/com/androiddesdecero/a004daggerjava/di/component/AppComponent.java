package com.androiddesdecero.a004daggerjava.di.component;

import com.androiddesdecero.a004daggerjava.di.module.AppModule;
import com.androiddesdecero.a004daggerjava.ui.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Singleton
@Component(modules = {
        AppModule.class})
public interface AppComponent {

    //Injecciones de Dependencias de los diferentes Objetos
    void inject(BaseApplication baseApplication);

    //Exposicon de Sub-grafos(El orden de los modulos)
    //Application application();
    //Context context();
}

