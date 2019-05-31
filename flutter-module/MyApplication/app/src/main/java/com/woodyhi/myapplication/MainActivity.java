package com.woodyhi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text_view).setOnClickListener(view -> {
            Intent intent = new Intent(getBaseContext(), com.example.middle.MainActivity.class);
            startActivity(intent);
        });
    }
}
