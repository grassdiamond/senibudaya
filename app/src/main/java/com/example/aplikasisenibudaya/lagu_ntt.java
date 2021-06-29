package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_ntt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_ntt);
    }

    public void info_lagu_ntt(View view) {
        Intent intent = new Intent(lagu_ntt.this, info_laguntt.class);
        startActivity(intent);
    }

    public void lirik_ntt(View view) {
        Intent intent = new Intent(lagu_ntt.this, lirik_ntt.class);
        startActivity(intent);
    }
}