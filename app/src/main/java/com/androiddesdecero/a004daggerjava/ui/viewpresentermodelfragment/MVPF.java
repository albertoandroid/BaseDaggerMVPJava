package com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment;

import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public interface MVPF {

    interface View{
        void showToast();
    }

    interface Presenter{
        void setModel(MVPF.Model model);
        void pulsarBoton();
        void showToast();
    }

    interface Model{
        void pulsarBoton();
    }
}
