package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_aceh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_aceh);
    }

    public void tar_trad_aceh(View view) {
        Intent intent = new Intent(provinsi_aceh.this, tari_aceh.class);
        startActivity(intent);
    }

    public void lagu_daerah_aceh(View view) {
        Intent intent = new Intent(provinsi_aceh.this, lagu_aceh.class);
        startActivity(intent);
    }
}