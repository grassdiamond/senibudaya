package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_papbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_papbar);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_papbar.this, info_papbar.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_papbar.this, video_papbar.class);
        startActivity(intent);
    }
}