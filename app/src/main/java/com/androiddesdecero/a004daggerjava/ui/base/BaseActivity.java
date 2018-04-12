package com.androiddesdecero.a004daggerjava.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androiddesdecero.a004daggerjava.di.component.ActivityComponent;
import com.androiddesdecero.a004daggerjava.di.component.DaggerActivityComponent;
import com.androiddesdecero.a004daggerjava.di.module.ActivityModule;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class BaseActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .appComponent(BaseApplication.get(this).getAppComponent())
                    .build();

        }
        return mActivityComponent;
    }
}
