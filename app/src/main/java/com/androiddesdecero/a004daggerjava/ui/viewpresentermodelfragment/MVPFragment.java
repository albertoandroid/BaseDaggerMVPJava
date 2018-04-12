package com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.androiddesdecero.a004daggerjava.R;
import com.androiddesdecero.a004daggerjava.ui.base.BaseFragment;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class MVPFragment extends BaseFragment implements MVPF.View {

    @Inject
    public MVPF.Presenter presenter;

    public MVPFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mv, container, false);

        getFragmentComponent().inject(this);
        Button button = view.findViewById(R.id.fragmentButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.pulsarBoton();
            }
        });
        return view;
    }

    @Override
    public void showToast() {
        Log.d("TAG", "VPM-FRAGMENTTTTTTTT-Model-Presenter-Activity");
    }

}
