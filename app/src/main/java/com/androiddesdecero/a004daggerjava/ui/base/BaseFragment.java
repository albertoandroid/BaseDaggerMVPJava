package com.androiddesdecero.a004daggerjava.ui.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;


import com.androiddesdecero.a004daggerjava.di.component.DaggerFragmentComponent;
import com.androiddesdecero.a004daggerjava.di.component.FragmentComponent;
import com.androiddesdecero.a004daggerjava.di.module.FragmentModule;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class BaseFragment extends Fragment {

    private FragmentComponent mFragmentComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public FragmentComponent getFragmentComponent() {

        if (mFragmentComponent == null) {
            mFragmentComponent = DaggerFragmentComponent.builder()
                    .fragmentModule(new FragmentModule(this))
                    .appComponent(BaseApplication.get(getContext()).getAppComponent())
                    .build();
        }

        return mFragmentComponent;
    }
}
