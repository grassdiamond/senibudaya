package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_kalteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_kalteng);
    }

    public void tar_trad_kalteng(View view) {
        Intent intent = new Intent(provinsi_kalteng.this, tari_kalteng.class);
        startActivity(intent);
    }

    public void lagu_daerah_kalteng(View view) {
        Intent intent = new Intent(provinsi_kalteng.this, lagu_kalteng.class);
        startActivity(intent);
    }
}