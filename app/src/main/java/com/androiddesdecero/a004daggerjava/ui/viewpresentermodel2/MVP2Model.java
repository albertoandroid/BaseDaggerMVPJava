package com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2;

import android.util.Log;

import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class MVP2Model implements MVP2.Model {

    private MVP2.Presenter presenter;

    public MVP2Model(MVP2.Presenter presenter) {
        this.presenter = presenter;

    }

    @Override
    public void pulsarBoton() {
        Log.d("TAG", "paco");
        presenter.showToast();
    }
}
