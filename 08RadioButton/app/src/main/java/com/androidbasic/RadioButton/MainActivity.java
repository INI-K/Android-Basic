package com.androidbasic.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소값을 담을 참조 변수
    RadioButton radioButton3, radioButton4;
    RadioGroup group1, group2;
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소값을 얻어온다\
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        group1 = (RadioGroup) findViewById(R.id.group1);
        group2 = (RadioGroup) findViewById(R.id.group2);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        //라디오 그룹에 리스너를 설정한다.
        RadioListener listener = new RadioListener();
        group1.setOnCheckedChangeListener(listener);
        group2.setOnCheckedChangeListener(listener);

    }

    public void btn1Method(View view) {
        radioButton3.setChecked(true);
        radioButton4.setChecked(true);
    }

    public void btn2Method(View view) {
        //각 라디오 그룹 내에서 선택되어 있는 라디오 버튼의 id값을 가져온다.
        int id1 = group1.getCheckedRadioButtonId();
        int id2 = group2.getCheckedRadioButtonId();

        switch (id1) {
            case R.id.radioButton:
                textView.setText("라디오 버튼 1-1 이 선택되었습니다.");
                break;
            case R.id.radioButton2:
                textView.setText("라디오 버튼 1-2 이 선택되었습니다.");
                break;
            case R.id.radioButton3:
                textView.setText("라디오 버튼 1-3이 선택 되었습니다.");
                break;
        }

        switch (id2) {
            case R.id.radioButton4:
                textView2.setText("라디오 버튼 2-1 이 선택되었습니다.");
                break;
            case R.id.radioButton5:
                textView2.setText("라디오 버튼 2-2 이 선택되었습니다.");
                break;
            case R.id.radioButton6:
                textView2.setText("라디오 버튼 2-3이 선택 되었습니다.");
                break;
        }
    }

    class RadioListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            //체크 상태가 변경된 라디오 그룹의 아이디를 추출한다.

            int id = group.getId();

            switch (id) {
                case R.id.group1:
                    switch (checkedId) {
                        case R.id.radioButton:
                            textView.setText("라디오 버튼 이벤트 1-1");
                            break;
                        case R.id.radioButton2:
                            textView.setText("라디오 버튼 이벤트 1-2");
                            break;
                        case R.id.radioButton3:
                            textView.setText("라디오 버튼 이벤트 1-3");
                            break;
                    }
                case  R.id.group2:
                    switch (checkedId) {
                        case R.id.radioButton4:
                            textView.setText("라디오 버튼 이벤트 2-1");
                            break;
                        case R.id.radioButton5:
                            textView.setText("라디오 버튼 이벤트 2-2");
                            break;
                        case R.id.radioButton6:
                            textView.setText("라디오 버튼 이벤트 2-3");
                            break;
                    }
            }
        }
    }
}