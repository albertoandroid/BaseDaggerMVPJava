package com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.a004daggerjava.R;
import com.androiddesdecero.a004daggerjava.ui.base.BaseActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVP;

import javax.inject.Inject;

public class MVP2Activity extends BaseActivity implements MVP2.View {

    @Inject
    MVP2.Presenter presenter;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp2);

        getActivityComponent().inject(this);
        button = findViewById(R.id.mvp2ActicityBt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.pulsarBoton();
            }
        });
    }

    @Override
    public void showToast() {
        Log.d("TAG", "VPM2222Model-Presenter-Activity");
    }
}
