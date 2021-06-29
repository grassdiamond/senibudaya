package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_jatim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_jatim);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_jatim.this, info_jatim.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_jatim.this, video_jatim.class);
        startActivity(intent);
    }
}