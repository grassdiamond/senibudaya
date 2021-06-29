package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_maluku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_maluku);
    }

    public void tar_trad_maluku(View view) {
        Intent intent = new Intent(provinsi_maluku.this, tari_maluku.class);
        startActivity(intent);
    }

    public void lagu_daerah_maluku(View view) {
        Intent intent = new Intent(provinsi_maluku.this, lagu_maluku.class);
        startActivity(intent);
    }
}