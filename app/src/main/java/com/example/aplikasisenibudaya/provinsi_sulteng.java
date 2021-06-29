package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_sulteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_sulteng);
    }

    public void tar_trad_sulteng(View view) {
        Intent intent = new Intent(provinsi_sulteng.this, tari_sulteng.class);
        startActivity(intent);
    }

    public void lagu_daerah_sulteng(View view) {
        Intent intent = new Intent(provinsi_sulteng.this, lagu_sulteng.class);
        startActivity(intent);
    }
}