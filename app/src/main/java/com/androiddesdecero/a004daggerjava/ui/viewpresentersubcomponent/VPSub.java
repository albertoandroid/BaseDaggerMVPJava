package com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public interface VPSub {

    interface View{
        void showToast();
    }
    interface Presenter{
        void pulsarBoton();
        void showToast();
    }
}
