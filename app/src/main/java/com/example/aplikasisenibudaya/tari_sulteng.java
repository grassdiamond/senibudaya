package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_sulteng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_sulteng);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_sulteng.this, info_sulteng.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_sulteng.this, video_sulteng.class);
        startActivity(intent);
    }
}