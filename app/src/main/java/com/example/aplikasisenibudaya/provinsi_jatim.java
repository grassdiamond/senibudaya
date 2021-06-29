package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_jatim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_jatim);
    }

    public void tar_trad_jatim(View view) {
        Intent intent = new Intent(provinsi_jatim.this, tari_jatim.class);
        startActivity(intent);
    }

    public void lagu_daerah_jatim(View view) {
        Intent intent = new Intent(provinsi_jatim.this, lagu_jatim.class);
        startActivity(intent);
    }
}