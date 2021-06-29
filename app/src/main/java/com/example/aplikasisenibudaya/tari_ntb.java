package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_ntb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_ntb);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_ntb.this, info_ntb.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_ntb.this, video_ntb.class);
        startActivity(intent);
    }
}