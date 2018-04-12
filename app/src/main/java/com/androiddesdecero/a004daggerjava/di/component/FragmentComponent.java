package com.androiddesdecero.a004daggerjava.di.component;

import android.app.Fragment;

import com.androiddesdecero.a004daggerjava.di.module.ActivityModule;
import com.androiddesdecero.a004daggerjava.di.module.FragmentModule;
import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.di.scope.PerFragment;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFragment;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@PerFragment
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    void inject(MVPFragment mvpFragment);
}
