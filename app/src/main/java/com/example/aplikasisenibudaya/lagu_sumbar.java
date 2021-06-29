package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_sumbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_sumbar);
    }

    public void info_lagu_sumbar(View view) {
        Intent intent = new Intent(lagu_sumbar.this, info_lagusumbar.class);
        startActivity(intent);
    }

    public void lirik_sumbar(View view) {
        Intent intent = new Intent(lagu_sumbar.this, lirik_sumbar.class);
        startActivity(intent);
    }
}