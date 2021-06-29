package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_babel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_babel);
    }

    public void info_campak(View view) {
        Intent intent = new Intent(tari_babel.this, info_babel.class);
        startActivity(intent);
    }

    public void video_campak(View view) {
        Intent intent = new Intent(tari_babel.this, video_babel.class);
        startActivity(intent);
    }
}