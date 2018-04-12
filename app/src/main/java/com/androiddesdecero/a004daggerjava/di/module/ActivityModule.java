package com.androiddesdecero.a004daggerjava.di.module;

import android.content.Context;

import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.ui.base.BaseActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VP;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPPresenter;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Module
public class ActivityModule {

    private BaseActivity activity;
    // private BaseFragment fragment;

    public ActivityModule() {
    }

    public ActivityModule(BaseActivity baseActivity) {
        this.activity = baseActivity;
    }
    @PerActivity
    @Named("context")
    @Provides
    Context provideContext() {
        return activity;
    }

    @PerActivity
    @Provides
    BaseActivity provideActivity() {
        return activity;
    }

    /***************************************************
    VP Activity
     ****************************************************/
    @PerActivity
    @Provides
    public VP.View provideVPView(){
        return new VPActivity();
    }

    @PerActivity
    @Provides
    VP.Presenter providePresenter(VP.View view){
        return new VPPresenter(view);
    }

    /***************************************************
     MVP Activity
     ****************************************************/
}
