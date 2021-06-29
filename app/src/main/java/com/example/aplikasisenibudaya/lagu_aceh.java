package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_aceh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_aceh);
    }

    public void info_lagu_aceh(View view) {
        Intent intent = new Intent(lagu_aceh.this, info_laguaceh.class);
        startActivity(intent);
    }

    public void lirik_aceh(View view) {
        Intent intent = new Intent(lagu_aceh.this, lirik_aceh.class);
        startActivity(intent);
    }
}