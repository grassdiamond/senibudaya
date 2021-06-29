package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_papua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_papua);
    }

    public void tar_trad_papua(View view) {
        Intent intent = new Intent(provinsi_papua.this, tari_papua.class);
        startActivity(intent);
    }

    public void lagu_daerah_papua(View view) {
        Intent intent = new Intent(provinsi_papua.this, lagu_papua.class);
        startActivity(intent);
    }
}