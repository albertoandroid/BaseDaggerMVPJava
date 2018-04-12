package com.androiddesdecero.a004daggerjava.di.module;

import android.content.Context;

import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.ui.base.BaseActivity;
import com.androiddesdecero.a004daggerjava.ui.base.BaseFragment;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VP;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVPModel;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVPPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2.MVP2;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2.MVP2Activity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2.MVP2Model;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2.MVP2Presenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPF;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Module
public class ActivityModule {

    private BaseActivity activity;
    private BaseFragment fragment;

    public ActivityModule() {
    }

    public ActivityModule(BaseActivity baseActivity) {
        this.activity = baseActivity;
    }

    public ActivityModule(BaseFragment baseFragment) {
        this.fragment = baseFragment;
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
    @PerActivity
    @Provides
    public MVP.View provideMVPView(){
        return new MVPActivity();
    }

    @PerActivity
    @Provides MVP.Presenter providePresenterMVP(MVP.View view){
        MVP.Presenter presenter = new MVPPresenter(view);
        MVP.Model model = new MVPModel(presenter);
        presenter.setModel(model);
        return presenter;
    }

    /***************************************************
     MVP2 Activity
     ****************************************************/
    @PerActivity
    @Provides
    public MVP2.View provideMVP2View(){
        return new MVP2Activity();
    }

    @PerActivity
    @Provides MVP2.Presenter providePresenterMVP2(MVP2.View view){
        MVP2.Presenter presenter = new MVP2Presenter(view);
        return presenter;
    }

    @PerActivity
    @Provides MVP2.Model provideModelMVP2(MVP2.Presenter presenter){
        return new MVP2Model(presenter);
    }

}
