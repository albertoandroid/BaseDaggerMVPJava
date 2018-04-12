package com.androiddesdecero.a004daggerjava.ui.viewpresenter;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public interface VP {

    interface View{
        void showToast();
    }
    interface Presenter{
        void pulsarBoton();
        void showToast();
    }
}
