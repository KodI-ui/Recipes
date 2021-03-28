package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChooseKind extends AppCompatActivity {
    Button allDishes;
    ImageButton salads, hotFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_kind);
        allDishes = findViewById(R.id.button17);
        salads = findViewById(R.id.imageButton2);
        hotFood = findViewById(R.id.imageButton);
        allDishes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseKind.this, PreviewActivity.class);
            }
        });

    }
}