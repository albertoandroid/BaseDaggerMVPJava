package com.androiddesdecero.a004daggerjava.ui.viewpresenter;

import android.util.Log;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class VPPresenter implements VP.Presenter {

    private VP.View view;

    public VPPresenter(VP.View view){
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
