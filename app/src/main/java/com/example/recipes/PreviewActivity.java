package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;

public class PreviewActivity extends AppCompatActivity {

    Button yaich, cesar, borsh, pelmeni, sousForCesar, kutya, plov, supSFrik, boilion, draniki, shaurma, chiken, ledenci, zefir, pieSKlubnikoi, lemonade;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        yaich = findViewById(R.id.button);
        cesar = findViewById(R.id.button2);
        borsh = findViewById(R.id.button3);
        pelmeni = findViewById(R.id.button4);
        sousForCesar = findViewById(R.id.button5);
        kutya = findViewById(R.id.button6);
        plov = findViewById(R.id.button7);
        supSFrik = findViewById(R.id.button8);
        boilion = findViewById(R.id.button9);
        draniki = findViewById(R.id.button10);
        shaurma = findViewById(R.id.button11);
        chiken = findViewById(R.id.button12);
        ledenci = findViewById(R.id.button13);
        zefir = findViewById(R.id.button14);
        pieSKlubnikoi = findViewById(R.id.button15);
        lemonade = findViewById(R.id.button16);
        yaich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Yaichnicha.class);
                startActivity(intent);
            }
        });
        cesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, SaladCesar.class);
                startActivity(intent);
            }
        });
        borsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Borshch.class);
                startActivity(intent);
            }
        });
        sousForCesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, SousForCesar.class);
                startActivity(intent);
            }
        });
        kutya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Kutya.class);
                startActivity(intent);
            }
        });
        supSFrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, SoupWthFrikadelki.class);
                startActivity(intent);
            }
        });
        boilion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Boilion.class);
                startActivity(intent);
            }
        });
        draniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Draniki.class);
                startActivity(intent);
            }
        });
        shaurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Shaurma.class);
                startActivity(intent);
            }
        });
        chiken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Chicken.class);
                startActivity(intent);
            }
        });
        ledenci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Ledenci.class);
                startActivity(intent);
            }
        });
        zefir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Zefir.class);
                startActivity(intent);
            }
        });
        pieSKlubnikoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, PieWthStrawberry.class);
                startActivity(intent);
            }
        });
        lemonade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Lemonade.class);
                startActivity(intent);
            }
        });
        pelmeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Pelmeni.class);
                startActivity(intent);
            }
        });
        plov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewActivity.this, Plov.class);
                startActivity(intent);
            }
        });
    }
}
