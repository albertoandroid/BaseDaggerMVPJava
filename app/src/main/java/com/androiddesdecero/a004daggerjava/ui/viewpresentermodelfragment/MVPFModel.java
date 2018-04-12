package com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment;

import android.util.Log;

import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class MVPFModel implements MVPF.Model {

    private MVPF.Presenter presenter;

    public MVPFModel(MVPF.Presenter presenter){
        this.presenter = presenter;

    }

    @Override
    public void pulsarBoton() {
        Log.d("TAG", "pacoÑñññññññ");
        presenter.showToast();
    }
}
