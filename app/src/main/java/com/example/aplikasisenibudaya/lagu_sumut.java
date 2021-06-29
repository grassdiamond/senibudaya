package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_sumut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_sumut);
    }

    public void info_lagu_sumut(View view) {
        Intent intent = new Intent(lagu_sumut.this, info_lagusumut.class);
        startActivity(intent);
    }

    public void lirik_sumut(View view) {
        Intent intent = new Intent(lagu_sumut.this, lirik_sumut.class);
        startActivity(intent);
    }
}