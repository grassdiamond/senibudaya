package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_jatim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_jatim);
    }

    public void info_lagu_jatim(View view) {
        Intent intent = new Intent(lagu_jatim.this, info_lagujatim.class);
        startActivity(intent);
    }

    public void lirik_jatim(View view) {
        Intent intent = new Intent(lagu_jatim.this, lirik_jatim.class);
        startActivity(intent);
    }
}