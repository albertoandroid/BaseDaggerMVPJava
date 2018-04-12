package com.androiddesdecero.a004daggerjava.ui.viewpresentermodel;

import android.util.Log;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class MVPModel implements MVP.Model {

    private MVP.Presenter presenter;

    public MVPModel(MVP.Presenter presenter){
        this.presenter = presenter;

    }

    @Override
    public void pulsarBoton() {
        Log.d("TAG", "paco");
        presenter.showToast();
    }

}
