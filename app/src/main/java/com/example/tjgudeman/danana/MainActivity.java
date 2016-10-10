package com.example.tjgudeman.danana;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setText("What a play!");
        button.setAlpha(.8f);

        final MediaPlayer mp;
        mp = MediaPlayer.create(this, R.raw.espn);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mp.start();
            }


        });
    }
}
