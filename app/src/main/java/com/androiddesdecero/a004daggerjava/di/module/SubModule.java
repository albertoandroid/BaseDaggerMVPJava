package com.androiddesdecero.a004daggerjava.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.di.scope.PerSubComponent;
import com.androiddesdecero.a004daggerjava.ui.base.BaseActivity;
import com.androiddesdecero.a004daggerjava.ui.base.BaseFragment;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VP;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent.VPSub;
import com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent.VPSubPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent.ViewPresenterSubActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Module
public class SubModule {

    private AppCompatActivity activity;
    private BaseFragment fragment;

    public SubModule() {
    }

    public SubModule(AppCompatActivity baseActivity) {
        this.activity = baseActivity;
    }

    @PerSubComponent
    @Provides
    Context provideContext() {
        return activity;
    }

    @PerSubComponent
    @Provides
    AppCompatActivity provideActivity() {
        return activity;
    }


    /***************************************************
     VPSub Activity
     ****************************************************/
    @PerSubComponent
    @Provides
    public VPSub.View provideVPView(){
        return new ViewPresenterSubActivity();
    }

    @PerSubComponent
    @Provides
    VPSub.Presenter providePresenter(VPSub.View view){
        return new VPSubPresenter(view);
    }

}
