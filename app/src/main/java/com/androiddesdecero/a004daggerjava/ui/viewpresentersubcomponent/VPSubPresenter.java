package com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent;

import android.util.Log;

import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VP;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class VPSubPresenter implements VPSub.Presenter {

    private VPSub.View view;

    public VPSubPresenter(VPSub.View view){
        this.view = view;
    }

    @Override
    public void pulsarBoton() {
        Log.d("TAG", "VPPresenter");
        showToast();
    }

    @Override
    public void showToast() {
        view.showToast();
    }
}
