package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_papua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_papua);
    }

    public void info_lagu_papua(View view) {
        Intent intent = new Intent(lagu_papua.this, info_lagupapua.class);
        startActivity(intent);
    }

    public void lirik_papua(View view) {
        Intent intent = new Intent(lagu_papua.this, lirik_papua.class);
        startActivity(intent);
    }
}