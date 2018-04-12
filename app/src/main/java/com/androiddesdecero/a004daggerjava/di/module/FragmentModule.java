package com.androiddesdecero.a004daggerjava.di.module;

import android.content.Context;

import com.androiddesdecero.a004daggerjava.di.scope.PerActivity;
import com.androiddesdecero.a004daggerjava.di.scope.PerFragment;
import com.androiddesdecero.a004daggerjava.ui.base.BaseActivity;
import com.androiddesdecero.a004daggerjava.ui.base.BaseFragment;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VP;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVPModel;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVPPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPF;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFModel;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFPresenter;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Module
public class FragmentModule {

    private BaseFragment fragment;

    public FragmentModule() {
    }

    public FragmentModule(BaseFragment baseFragment) {
        this.fragment = baseFragment;
    }

    @PerFragment
    @Provides
    Context provideContext() {
        return fragment.getActivity();
    }

    @PerFragment
    @Provides
    BaseFragment provideFragmentBase() {
        return fragment;
    }


    /***************************************************
     MVPFragment Activity
     ****************************************************/

    @PerFragment
    @Provides
    public MVPFragment provideFragment(){
        return new MVPFragment();
    }

    @PerFragment
    @Provides
    public MVPF.View provideMVPFragmentView(){
        return new MVPFragment();
    }


    @PerFragment
    @Provides MVPF.Presenter providePresenterMVPF(MVPF.View view){
        MVPF.Presenter presenter = new MVPFPresenter(view);
        MVPF.Model model = new MVPFModel(presenter);
        presenter.setModel(model);
        return presenter;
    }

    /*
    @PerFragment
    @Provides MVPF.Presenter providePresenterMVPF(MVPF.View view){
        return new MVPFPresenter(view);
    }
    */

}
