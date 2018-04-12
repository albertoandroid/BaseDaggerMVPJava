package com.androiddesdecero.a004daggerjava.di.component;

import com.androiddesdecero.a004daggerjava.di.module.ActivityModule;
import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2.MVP2Activity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFragment;

import dagger.Component;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(VPActivity vpActivity);

    void inject(MVPActivity mvpActivity);

    void inject(MVP2Activity mvp2Activity);

}

