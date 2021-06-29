package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bali);
    }

    public void tar_trad_bali(View view) {
        Intent intent = new Intent(bali.this, tari_bali.class);
        startActivity(intent);
    }

    public void lagu_daerah_bali(View view) {
        Intent intent = new Intent(bali.this, lagu_bali.class);
        startActivity(intent);
    }
}