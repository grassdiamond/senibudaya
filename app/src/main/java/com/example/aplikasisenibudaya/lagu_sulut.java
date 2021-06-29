package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_sulut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_sulut);
    }

    public void info_lagu_sulut(View view) {
        Intent intent = new Intent(lagu_sulut.this, info_lagusulut.class);
        startActivity(intent);
    }

    public void lirik_sulut(View view) {
        Intent intent = new Intent(lagu_sulut.this, lirik_sulut.class);
        startActivity(intent);
    }
}