package com.example.aplikasisenibudaya;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.ImageButton;

import java.io.IOException;

public class info_jatim extends AppCompatActivity implements View.OnClickListener {
    private ImageButton play, pause, stop;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_jatim);

        play = findViewById(R.id.btnplayremo);
        pause = findViewById(R.id.btnpauseremo);
        stop = findViewById(R.id.btnstopremo);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

        awal();
    }

    private void awal() {
        play.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(false);
    }

    private void playAudio() {
        mediaPlayer = MediaPlayer.create(this, R.raw.info_remo);
        play.setEnabled(false);
        pause.setEnabled(true);
        stop.setEnabled(true);

        try {
            mediaPlayer.prepare();
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        } catch (IOException ex1) {
            ex1.printStackTrace();
        }
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                awal();
            }
        });
    }

    private void pauseAudio() {
        if (mediaPlayer.isPlaying()) {
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
        } else {
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        }
    }

    private void stopAudio() {
        mediaPlayer.stop();
        try {
            mediaPlayer.prepare();
            mediaPlayer.seekTo(0);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        awal();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnplayremo:
                playAudio();
                break;

            case R.id.btnpauseremo:
                pauseAudio();
                break;

            case R.id.btnstopremo:
                stopAudio();
                break;
        }
    }
}