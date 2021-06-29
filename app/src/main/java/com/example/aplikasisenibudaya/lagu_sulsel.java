package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_sulsel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_sulsel);
    }

    public void info_lagu_sulsel(View view) {
        Intent intent = new Intent(lagu_sulsel.this, info_lagusulsel.class);
        startActivity(intent);
    }

    public void lirik_sulsel(View view) {
        Intent intent = new Intent(lagu_sulsel.this, lirik_sulsel.class);
        startActivity(intent);
    }
}