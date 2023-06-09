package com.example.androidtvproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.video);
        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.videoupb;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();


        ImageView btnfai = findViewById(R.id.btn_fai);
        btnfai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FaiActivity.class);
                startActivity(intent);
            }
        });

        ImageView btnfeb = findViewById(R.id.btn_feb);
        btnfeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FebActivity.class);
                startActivity(intent);
            }
        });

        ImageView btnfiphum = findViewById(R.id.btn_fiphum);
        btnfiphum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FiphumActivity.class);
                startActivity(intent);
            }
        });

        ImageView btnfatek = findViewById(R.id.btn_fatek);
        btnfatek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FatekActivity.class);
                startActivity(intent);
            }
        });
    }
}