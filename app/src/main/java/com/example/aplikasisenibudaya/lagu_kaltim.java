package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_kaltim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_kaltim);
    }

    public void info_lagu_kaltim(View view) {
        Intent intent = new Intent(lagu_kaltim.this, info_lagukaltim.class);
        startActivity(intent);
    }

    public void lirik_kaltim(View view) {
        Intent intent = new Intent(lagu_kaltim.this, lirik_kaltim.class);
        startActivity(intent);
    }
}