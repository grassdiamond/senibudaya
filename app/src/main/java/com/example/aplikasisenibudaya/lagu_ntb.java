package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_ntb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_ntb);
    }

    public void info_lagu_ntb(View view) {
        Intent intent = new Intent(lagu_ntb.this, info_laguntb.class);
        startActivity(intent);
    }

    public void lirik_ntb(View view) {
        Intent intent = new Intent(lagu_ntb.this, lirik_ntb.class);
        startActivity(intent);
    }
}