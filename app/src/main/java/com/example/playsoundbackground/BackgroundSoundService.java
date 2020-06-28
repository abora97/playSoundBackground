package com.example.playsoundbackground;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class BackgroundSoundService extends Service {

    MediaPlayer mediaPlayer;


    @Override
    public IBinder onBind(Intent intent) {

        Toast.makeText(this, "onBind", Toast.LENGTH_SHORT).show();

        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
          mediaPlayer = MediaPlayer.create(this, R.raw.sound);
             mediaPlayer.setLooping(true); // Set looping
            mediaPlayer.setVolume(100, 100);
            mediaPlayer.start();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "onStartCommand", Toast.LENGTH_SHORT).show();

             mediaPlayer.start();
     //   Toast.makeText(getApplicationContext(), "Playing Bohemian Rashpody in the Background", Toast.LENGTH_SHORT).show();
        return startId;
    }




    @Override
    public void onDestroy() {
      //  mediaPlayer.stop();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
      //    mediaPlayer.release();
    }

    @Override
    public void onLowMemory() {
    }
}
