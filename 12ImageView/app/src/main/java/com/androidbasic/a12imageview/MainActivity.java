package com.androidbasic.a12imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소값을 담을 참조변수

    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소값을 받아온다
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        //이미지를 셋팅한다.
        imageView4.setImageResource(R.drawable.img_android);
    }
}