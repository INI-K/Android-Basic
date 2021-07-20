package com.androidbasic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Activity 가 생성 될때 자동으로 호출된다
    // 화면 회전이 발생했을때 자동으로 호출된다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       // System.out.println("OnCreate 메서드 호출");
        Log.d("Test","OnCreate 호출");
    }

    @Override
    //onCreate 메서드 호출 이후에 자동으로 호출
    //Activity가 정지상태가 되었다가 활동 상태로 돌아올때 호출
    protected void onStart() {
        super.onStart();

        Log.d("Test","onStart 호출");
    }

    @Override
    // onStart 메서드가 호출된 이후에 자동으로 호출된다.
    // Activity가 일시 정지 되었다가 다시 돌아 올떄 호출
    protected void onResume() {
        super.onResume();

        Log.d("Test","onResume 호출");
    }

    @Override
    //Activity가 정지 상태가 되었다가 활동 상태로 돌아갈때 onStart 메서드 전에 호출된다
    protected void onRestart() {
        super.onRestart();

        Log.d("Test","onRestart 호출");
    }

    @Override
    //Activity가 일시 정지 상태가 될떄 호출된다.
    //화면상에서 완전히 사라진거나 현재 화면 위에 작은 팝업창 같은것이 나타날 때 호출
    protected void onPause() {
        super.onPause();

        Log.d("Test","onPause 호출");
    }

    @Override
    //Activity가 화면에서 사라질 때 호출된다.
    protected void onStop() {
        super.onStop();

        Log.d("Test","onStop 호출");
    }

    @Override
    //현재 액티비티의 수행이 완전히종료되어 메모리상에서 제거될 때 호출
    protected void onDestroy() {
        super.onDestroy();
        
        Log.d("Test","onDestroy 호출");
    }
}