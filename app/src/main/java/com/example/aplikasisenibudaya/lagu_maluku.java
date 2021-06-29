package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_maluku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_maluku);
    }

    public void info_lagu_maluku(View view) {
        Intent intent = new Intent(lagu_maluku.this, info_lagumaluku.class);
        startActivity(intent);
    }

    public void lirik_maluku(View view) {
        Intent intent = new Intent(lagu_maluku.this, lirik_maluku.class);
        startActivity(intent);
    }
}