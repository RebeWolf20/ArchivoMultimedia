package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class UrlVideo extends AppCompatActivity {
    private VideoView vv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url_video);
        vv1 = findViewById(R.id.videourl);

        String VideoUrl = "https://drive.google.com/uc?export=download&id=1NKiV1R2xw3HFnArOkDzv98T5wvtTDs1w";
        MediaController mdc = new MediaController(this);
        mdc.setAnchorView(vv1);
        vv1.setMediaController(mdc);

        vv1.setVideoURI(Uri.parse(VideoUrl));

        vv1.start();

    }
}