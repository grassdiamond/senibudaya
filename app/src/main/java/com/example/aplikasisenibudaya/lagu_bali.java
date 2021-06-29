package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_bali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_bali);
    }

    public void info_lagu_bali(View view) {
        Intent intent = new Intent(lagu_bali.this, info_lagubali.class);
        startActivity(intent);
    }

    public void lirik_bali(View view) {
        Intent intent = new Intent(lagu_bali.this, lirik_bali.class);
        startActivity(intent);
    }
}