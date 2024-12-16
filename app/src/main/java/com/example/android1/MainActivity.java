package com.example.android1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNext = findViewById(R.id.buttonNextA);
        buttonNext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityB.class);
            startActivity(intent);
        });
    }
}
