package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_ntb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_ntb);
    }

    public void tar_trad_ntb(View view) {
        Intent intent = new Intent(provinsi_ntb.this, tari_ntb.class);
        startActivity(intent);
    }

    public void lagu_daerah_ntb(View view) {
        Intent intent = new Intent(provinsi_ntb.this, lagu_ntb.class);
        startActivity(intent);
    }
}