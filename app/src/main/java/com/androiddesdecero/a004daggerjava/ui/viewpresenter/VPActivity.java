package com.androiddesdecero.a004daggerjava.ui.viewpresenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.a004daggerjava.R;
import com.androiddesdecero.a004daggerjava.ui.base.BaseActivity;

import javax.inject.Inject;

public class VPActivity extends BaseActivity implements VP.View {

    @Inject
    VP.Presenter presenter;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp);
        getActivityComponent().inject(this);
        button = findViewById(R.id.vpActicityBt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.pulsarBoton();
            }
        });
    }

    @Override
    public void showToast() {
        Log.d("TAG", "VPPresenter-Activity");
    }
}
