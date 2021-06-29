package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_riau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_riau);
    }

    public void tar_trad_riau(View view) {
        Intent intent = new Intent(provinsi_riau.this, tari_riau.class);
        startActivity(intent);
    }
}