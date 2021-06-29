package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_sumut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_sumut);
    }

    public void tar_trad_sumut(View view) {
        Intent intent = new Intent(provinsi_sumut.this, tari_sumut.class);
        startActivity(intent);
    }

    public void lagu_daerah_sumut(View view) {
        Intent intent = new Intent(provinsi_sumut.this, lagu_sumut.class);
        startActivity(intent);
    }
}