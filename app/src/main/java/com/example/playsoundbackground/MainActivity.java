package com.example.playsoundbackground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlay;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btnPlay);
        mp = MediaPlayer.create(this, R.raw.sound);


        btnPlay.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getApplicationContext(), BackgroundSoundService.class);
        startService(intent);



    }
}