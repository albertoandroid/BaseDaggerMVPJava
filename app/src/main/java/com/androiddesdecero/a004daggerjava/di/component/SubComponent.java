package com.androiddesdecero.a004daggerjava.di.component;

import com.androiddesdecero.a004daggerjava.di.module.SubModule;
import com.androiddesdecero.a004daggerjava.di.scope.PerSubComponent;
import com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent.ViewPresenterSubActivity;

import dagger.Subcomponent;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@PerSubComponent
@Subcomponent(modules = SubModule.class)
public interface SubComponent {
    void inject(ViewPresenterSubActivity viewPresenterSubActivity);
}
