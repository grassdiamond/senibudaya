package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_sulsel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_sulsel);
    }

    public void tar_trad_sulsel(View view) {
        Intent intent = new Intent(provinsi_sulsel.this, tari_sulsel.class);
        startActivity(intent);
    }

    public void lagu_daerah_sulsel(View view) {
        Intent intent = new Intent(provinsi_sulsel.this, lagu_sulsel.class);
        startActivity(intent);
    }
}