package com.androiddesdecero.a004daggerjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.a004daggerjava.ui.viewpresenter.VPActivity;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

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
               // startActivity(new Intent(getApplicationContext(), MVPActivity.class));
            }
        });
    }
}
