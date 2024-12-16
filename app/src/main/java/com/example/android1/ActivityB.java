package com.example.android1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button buttonNext = findViewById(R.id.buttonNextB);
        buttonNext.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityB.this, ActivityC.class);
            startActivity(intent);
        });
    }
}

