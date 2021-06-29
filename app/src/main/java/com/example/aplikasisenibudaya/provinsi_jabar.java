package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_jabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_jabar);
    }

    public void tar_trad_jabar(View view) {
        Intent intent = new Intent(provinsi_jabar.this, tari_jabar.class);
        startActivity(intent);
    }

    public void lagu_daerah_jabar(View view) {
        Intent intent = new Intent(provinsi_jabar.this, lagu_jabar.class);
        startActivity(intent);
    }
}