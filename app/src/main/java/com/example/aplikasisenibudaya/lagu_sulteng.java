package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_sulteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_sulteng);
    }

    public void info_lagu_sulteng(View view) {
        Intent intent = new Intent(lagu_sulteng.this, info_lagusulteng.class);
        startActivity(intent);
    }

    public void lirik_sulteng(View view) {
        Intent intent = new Intent(lagu_sulteng.this, lirik_sulteng.class);
        startActivity(intent);
    }
}