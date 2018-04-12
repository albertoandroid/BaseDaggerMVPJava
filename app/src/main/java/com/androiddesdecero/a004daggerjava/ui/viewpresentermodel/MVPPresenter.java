package com.androiddesdecero.a004daggerjava.ui.viewpresentermodel;

import android.util.Log;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class MVPPresenter implements MVP.Presenter {

    private MVP.View view;
    private MVP.Model model;

    @Override
    public void setModel (MVP.Model model){
        this.model = model;
    }

    public MVPPresenter(MVP.View view){
        this.view = view;

    }

    public void bind(MVP.View view){
        this.view = view;
    }

    @Override
    public void pulsarBoton() {
        model.pulsarBoton();
        Log.d("TAG", "MVP2Presenter");
        showToast();
    }

    @Override
    public void showToast() {
        view.showToast();
    }

}
