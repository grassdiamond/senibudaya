package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_sulut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_sulut);
    }

    public void tar_trad_sulut(View view) {
        Intent intent = new Intent(provinsi_sulut.this, tari_sulut.class);
        startActivity(intent);
    }

    public void lagu_daerah_sulut(View view) {
        Intent intent = new Intent(provinsi_sulut.this, lagu_sulut.class);
        startActivity(intent);
    }
}