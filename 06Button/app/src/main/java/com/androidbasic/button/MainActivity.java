package com.androidbasic.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 뷰의 주소값 참소

    TextView textView;

    Button button, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 뷰의 주소값을 얻어온다
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        //리스거 객체를 생성
        BtnListener1 listener1 = new BtnListener1();
        BtnListener2 listener2 = new BtnListener2();
        BtnListener34 listener34 = new BtnListener34();

        //리스너를 버튼 객체에 설정한다.
        button.setOnClickListener(listener1);
        button2.setOnClickListener(listener2);
        button3.setOnClickListener(listener34);
        button4.setOnClickListener(listener34);
    }

    //첫번째 버튼과 연결된 리스너
    class BtnListener1 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            textView.setText("첫 번째 버튼을 눌렀습니다.");

        }
    }

    //첫번째 버튼과 연결된 리스너
    class BtnListener2 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            textView.setText("두 번째 버튼을 눌렀습니다.");

        }
    }

    class BtnListener34 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            //이벤트가 발생된 뷰의 ID 값을 추출한다.
            int id = v.getId();
            // id로 분기 한다.
            switch (id) {
                case R.id.button3:
                    textView.setText("세번째 버튼을 눌렀습니다.");
                    break;
                case R.id.button4:
                    textView.setText("네번째 버틀을 눌렀습니다");
                    break;
            }
        }
    }

    //다섯 번째 버튼을 누르면 호출되는 메서드

    public void btn5Method(View view) {
        textView.setText("다섯번째 버튼을 눌렀습니다.");
    }
    //여섯 번째 버튼을 누르면 호출되는 메서드
    public void btn6Method(View view) {
        textView.setText("여섯번째 버튼을 눌렀습니다.");
    }
    //일곱 번째, 여덟 번째 버튼을 누르면 호출되는 메서드

    public void btn78Method(View view) {
        //아이디값 추출
        int id = view.getId();
        //아이디값으로 분기한다.

        switch (id){
            case R.id.button7 :
                textView.setText("일곱번째 버튼을 누름");
                break;
            case R.id.button8 :
                textView.setText("여덟번째 버튼 누름");
                break;
        }
    }

}