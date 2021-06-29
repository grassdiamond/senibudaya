package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lagu_kalbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagu_kalbar);
    }

    public void info_lagu_kalbar(View view) {
        Intent intent = new Intent(lagu_kalbar.this, info_lagukalbar.class);
        startActivity(intent);
    }

    public void lirik_kalbar(View view) {
        Intent intent = new Intent(lagu_kalbar.this, lirik_kalbar.class);
        startActivity(intent);
    }
}