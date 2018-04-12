package com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.a004daggerjava.R;
import com.androiddesdecero.a004daggerjava.di.component.AppComponent;
import com.androiddesdecero.a004daggerjava.di.component.DaggerActivityComponent;
import com.androiddesdecero.a004daggerjava.di.component.DaggerAppComponent;
import com.androiddesdecero.a004daggerjava.di.module.ActivityModule;
import com.androiddesdecero.a004daggerjava.di.module.AppModule;
import com.androiddesdecero.a004daggerjava.di.module.SubModule;
import com.androiddesdecero.a004daggerjava.ui.base.BaseActivity;
import com.androiddesdecero.a004daggerjava.ui.base.BaseApplication;
import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VP;

import javax.inject.Inject;

public class ViewPresenterSubActivity extends AppCompatActivity implements VPSub.View {

    @Inject
    VPSub.Presenter presenter;
    private Button button;

    private AppComponent appComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_presenter_sub);

        ((BaseApplication)getApplication()).getAppComponent().newSubComponent(new SubModule()).inject(this);

        button = findViewById(R.id.vpsubBt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.pulsarBoton();
            }
        });
    }

    @Override
    public void showToast() {
        Log.d("TAG", "VPPresenter-Activity-SUBbbbbbbbbbbbb");
    }
}
