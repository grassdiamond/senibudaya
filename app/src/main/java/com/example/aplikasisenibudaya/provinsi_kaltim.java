package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_kaltim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_kaltim);
    }

    public void tar_trad_kaltim(View view) {
        Intent intent = new Intent(provinsi_kaltim.this, tari_kaltim.class);
        startActivity(intent);
    }

    public void lagu_daerah_kaltim(View view) {
        Intent intent = new Intent(provinsi_kaltim.this, lagu_kaltim.class);
        startActivity(intent);
    }
}