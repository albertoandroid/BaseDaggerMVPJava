package com.androiddesdecero.a004daggerjava.ui.viewpresentermodel;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public interface MVP {

    interface View{
        void showToast();
    }
    interface Presenter{
        void setModel(MVP.Model model);
        void pulsarBoton();
        void showToast();
    }
    interface Model{
        void pulsarBoton();
    }
}
