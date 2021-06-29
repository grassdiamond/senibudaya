package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_jakarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_jakarta);
    }

    public void info_lagu_jakarta(View view) {
        Intent intent = new Intent(lagu_jakarta.this, info_lagujakarta.class);
        startActivity(intent);
    }

    public void lirik_jakarta(View view) {
        Intent intent = new Intent(lagu_jakarta.this, lirik_jakarta.class);
        startActivity(intent);
    }
}