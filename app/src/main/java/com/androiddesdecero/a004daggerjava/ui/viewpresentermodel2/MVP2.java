package com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2;

import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public interface MVP2 {

    interface View{
        void showToast();
    }
    interface Presenter{
        //void setModel(MVP2.Model model);
        void pulsarBoton();
        void showToast();
    }
    interface Model{
        void pulsarBoton();
    }
}
