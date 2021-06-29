package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_sumbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_sumbar);
    }

    public void tar_trad_sumbar(View view) {
        Intent intent = new Intent(provinsi_sumbar.this, tari_sumbar1.class);
        startActivity(intent);
    }

    public void lagu_daerah_sumbar(View view) {
        Intent intent = new Intent(provinsi_sumbar.this, lagu_sumbar.class);
        startActivity(intent);
    }
}