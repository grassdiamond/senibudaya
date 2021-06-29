package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_jabar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_jabar);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_jabar.this, info_jabar.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_jabar.this, video_jabar.class);
        startActivity(intent);
    }
}