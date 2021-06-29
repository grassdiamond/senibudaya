package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_sulsel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_sulsel);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_sulsel.this, info_sulsel.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_sulsel.this, video_sulsel.class);
        startActivity(intent);
    }
}