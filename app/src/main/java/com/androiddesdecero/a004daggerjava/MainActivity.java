package com.androiddesdecero.a004daggerjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel.MVPActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodel2.MVP2Activity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentermodelfragment.MVPFragmentActivity;
import com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent.VPSub;
import com.androiddesdecero.a004daggerjava.ui.viewpresentersubcomponent.ViewPresenterSubActivity;
import com.androiddesdecero.a004daggerjava.ui.webservice.WebActivity;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button22;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.mainActivityBt);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), VPActivity.class));
            }
        });

        button2 = findViewById(R.id.mainActivityBt2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MVPActivity.class));
            }
        });

        button22 = findViewById(R.id.mainActivityBt22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), WebActivity.class));
            }
        });

        button3 = findViewById(R.id.mainActivityBt3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MVPFragmentActivity.class));
            }
        });
        button4 = findViewById(R.id.mainActivityBt4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ViewPresenterSubActivity.class));
            }
        });

    }
}
