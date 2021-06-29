package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_pabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_pabar);
    }

    public void tar_trad_pabar(View view) {
        Intent intent = new Intent(provinsi_pabar.this, tari_papbar.class);
        startActivity(intent);
    }

    public void lagu_daerah_pabar(View view) {
        Intent intent = new Intent(provinsi_pabar.this, lagu_papbar.class);
        startActivity(intent);
    }
}