package com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androiddesdecero.a004daggerjava.R;

public class MVPFragmentActivity extends AppCompatActivity {

    private FragmentTransaction fragmentTransaction;
    private MVPFragment mvpFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvpfragment);

        mvpFragment = new MVPFragment();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.mainActivityFragment, mvpFragment);
        fragmentTransaction.commit();
    }
}
