package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_jabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_jabar);
    }

    public void info_lagu_jabar(View view) {
        Intent intent = new Intent(lagu_jabar.this, info_lagujabar.class);
        startActivity(intent);
    }

    public void lirik_jabar(View view) {
        Intent intent = new Intent(lagu_jabar.this, lirik_jabar.class);
        startActivity(intent);
    }
}