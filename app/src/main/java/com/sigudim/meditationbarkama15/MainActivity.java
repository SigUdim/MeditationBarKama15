package com.sigudim.meditationbarkama15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.sigudim.meditationbarkama15.R.raw.guided_meditation15;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageButton one = (ImageButton) this.findViewById(R.id.button1);
        //MediaPlayer = mp;
        final MediaPlayer mp = MediaPlayer.create(this, guided_meditation15);
        //one.OnCreateContextMenuListener(new View.OnClickListener(){
        one.setOnClickListener(new View.OnClickListener() {
            // one.OnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }
}
