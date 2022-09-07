package com.tradennn1.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton car_image, police_image;
    private MediaPlayer policeSound, carSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        car_image = findViewById(R.id.car_imag);
        police_image = findViewById(R.id.police_image);

        carSound = MediaPlayer.create(this, R.raw.car);
        policeSound = MediaPlayer.create(this, R.raw.police);


        car_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayButton(carSound, policeSound);

            }
        });

        police_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayButton(policeSound, carSound);

            }
        });

    }

    private void soundPlayButton(MediaPlayer sound1, MediaPlayer sound2) {
        if(sound1.isPlaying()) {
            sound1.pause();
            sound1.seekTo(0);
            sound1.setLooping(false);
            // sound.pause();
        }

        if(sound2.isPlaying());
        sound2.pause();
        sound2.seekTo(0);
        sound2.setLooping(false);

        sound1.start();
        sound1.setLooping(true);
        // sound.seekTo(1000);
    }
}