package com.example.myservicestuto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button startServie, stopServie;
    private Intent myService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startServie = findViewById(R.id.button);
        stopServie = findViewById(R.id.button2);
        myService = new Intent(getApplicationContext(), MyService.class);

        startServie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(myService);
            }
        });

        stopServie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(myService);
            }
        });

    }
}