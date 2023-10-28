package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView vw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vw1 = findViewById(R.id.videoView);

        vw1.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoplayback));

        MediaController media = new MediaController(this);
        vw1.setMediaController(media);
        media.setAnchorView(vw1);
        vw1.start();
    }
    public void Camino(View view){
        Intent otro = new Intent(this, UrlVideo.class);
        startActivity(otro);

    }
}