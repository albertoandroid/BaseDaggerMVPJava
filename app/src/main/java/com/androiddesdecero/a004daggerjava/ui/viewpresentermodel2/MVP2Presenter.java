package com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2;

import android.util.Log;

import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;

import javax.inject.Inject;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class MVP2Presenter implements MVP2.Presenter {

    private MVP2.View view;

    @Inject
    MVP2.Model model;

    /*
    @Override
    public void setModel (MVP2.Model model){
        this.model = model;
    }
    */

    public MVP2Presenter(MVP2.View view){
        this.view = view;
    }

    public void bind(MVP2.View view){
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
