package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_kalteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_kalteng);
    }

    public void info_lagu_kalteng(View view) {
        Intent intent = new Intent(lagu_kalteng.this, info_lagukalteng.class);
        startActivity(intent);
    }

    public void lirik_kalteng(View view) {
        Intent intent = new Intent(lagu_kalteng.this, lirik_kalteng.class);
        startActivity(intent);
    }
}