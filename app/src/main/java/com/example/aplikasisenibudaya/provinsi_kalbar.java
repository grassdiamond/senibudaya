package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class provinsi_kalbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinsi_kalbar);
    }

    public void tar_trad_kalbar(View view) {
        Intent intent = new Intent(provinsi_kalbar.this, tari_kalbar.class);
        startActivity(intent);
    }

    public void lagu_daerah_kalbar(View view) {
        Intent intent = new Intent(provinsi_kalbar.this, lagu_kalbar.class);
        startActivity(intent);
    }
}