package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_ntt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_ntt);
    }

    public void tar_trad_ntt(View view) {
        Intent intent = new Intent(provinsi_ntt.this, tari_ntt.class);
        startActivity(intent);
    }

    public void lagu_daerah_ntt(View view) {
        Intent intent = new Intent(provinsi_ntt.this, lagu_ntt.class);
        startActivity(intent);
    }
}