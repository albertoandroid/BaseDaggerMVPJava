package com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment;

import android.util.Log;

import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class MVPFPresenter implements MVPF.Presenter {

    private MVPF.View view;
    private MVPF.Model model;

    public MVPFPresenter(MVPF.View view){
        this.view = view;
    }

    @Override
    public void setModel(MVPF.Model model) {
        this.model = model;
    }

    @Override
    public void pulsarBoton() {
        model.pulsarBoton();
        Log.d("TAG", "MVPPresenterKKKKK");
        showToast();
    }

    @Override
    public void showToast() {
        view.showToast();
    }

}
