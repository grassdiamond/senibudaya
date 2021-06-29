package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_papbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_papbar);
    }

    public void info_lagu_papbar(View view) {
        Intent intent = new Intent(lagu_papbar.this, info_lagupapbar.class);
        startActivity(intent);
    }

    public void lirik_papbar(View view) {
        Intent intent = new Intent(lagu_papbar.this, lirik_papbar.class);
        startActivity(intent);
    }
}