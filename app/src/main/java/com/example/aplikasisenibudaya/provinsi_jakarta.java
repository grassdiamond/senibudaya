package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_jakarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_jakarta);
    }

    public void tar_trad_jkt(View view) {
        Intent intent = new Intent(provinsi_jakarta.this, tari_jakarta.class);
        startActivity(intent);
    }

    public void lagu_daerah_jkt(View view) {
        Intent intent = new Intent(provinsi_jakarta.this, lagu_jakarta.class);
        startActivity(intent);
    }
}