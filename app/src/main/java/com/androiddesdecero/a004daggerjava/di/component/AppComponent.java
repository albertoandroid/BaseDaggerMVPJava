package com.androiddesdecero.a004daggerjava.di.component;

import com.androiddesdecero.a004daggerjava.di.module.AppModule;
import com.androiddesdecero.a004daggerjava.di.module.SubModule;
import com.androiddesdecero.a004daggerjava.di.scope.PerSubComponent;
import com.androiddesdecero.a004daggerjava.ui.base.BaseApplication;
import com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent.ViewPresenterSubActivity;
import com.androiddesdecero.a004daggerjava.ui.webservice.WebActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Singleton
@Component(modules = {
        AppModule.class})
public interface AppComponent {

    //Injecciones de Dependencias de los diferentes Objetos
    void inject(BaseApplication baseApplication);

    void inject(WebActivity webActivity);

    //Nuestro SubComponent
    SubComponent newSubComponent(SubModule subModule);

    //Exposicon de Sub-grafos(El orden de los modulos)
    //Application application();
    //Context context();
}

