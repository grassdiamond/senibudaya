package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_papua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_papua);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_papua.this, info_papua.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_papua.this, video_papua.class);
        startActivity(intent);
    }
}