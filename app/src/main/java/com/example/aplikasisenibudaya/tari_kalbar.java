package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tari_kalbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari_kalbar);
    }

    public void info(View view) {
        Intent intent = new Intent(tari_kalbar.this, info_kalbar.class);
        startActivity(intent);
    }

    public void video(View view) {
        Intent intent = new Intent(tari_kalbar.this, video_kalbar.class);
        startActivity(intent);
    }
}