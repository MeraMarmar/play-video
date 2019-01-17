package com.example.allinone.playvido;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView

                videoView=(VideoView)findViewById(R.id.videoView2);
        //لتشغيل فيديو من الاندرويد
        String uvi="android.resource://com.example.allinone.playvido/"+R.raw.video14;
        Uri uri=Uri.parse(uvi);
// لتشغيل الفيديو من الانترنت
      //  String v1="rtsp://r6---sn-4g5e6n7r.googlevideo.com/Cj0LENy73wIaNAkHXtXW0DhpIhMYDSANFC2gPBRbMOCoAUIASARgs5aPh5PjmsRaigELaE5jV3d1ajQwdWsM/CBC31A715BC1F66D7BE4C51AF7304E26131D02D9.3D472A434C6A269E3FE57143E477E19B1197C686/yt6/1/video.3gp";
      //  Uri uri=Uri.parse(v1);
        videoView.setVideoURI(uri);
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();
    }

}
