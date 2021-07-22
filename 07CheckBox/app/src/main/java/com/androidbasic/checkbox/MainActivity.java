package com.androidbasic.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.KeyEventDispatcher;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    CheckBox checkBox1, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);


        //체크박스에 리스너를 설정한다.
        CheckBoxListener listener = new CheckBoxListener();
        checkBox1.setOnCheckedChangeListener(listener);
        checkBox2.setOnCheckedChangeListener(listener);
        checkBox3.setOnCheckedChangeListener(listener);
    }

    //첫 번째 버튼을 누르면 호출되는 메서드
    //체크상태 값을 파악한다.
    public void btn1Method(View view) {
        textView.setText("");

        //체크상태에 따라 플요한 처리를 해준다.
        boolean a1 = checkBox1.isChecked();
        boolean a2 = checkBox2.isChecked();
        boolean a3 = checkBox3.isChecked();

        if (a1 == true) {
            textView.append("첫 번째 체크 박스가 체크되어 있습니다 \n");
        }
        if (a2 == true) {
            textView.append("두 번째 체크 박스가 체크되어 있습니다\n");
        }
        if (a3 == true) {
            textView.append("세 번째 체크 박스가 체크되어 있습니다\n");
        }

    }

    //두 번째 버튼과 연결된 메서드
    //모든 체크박스의 상태를 체크상태를 설정한다.
    public void btn2Method(View view) {
        checkBox1.setChecked(true);
        checkBox2.setChecked(true);
        checkBox3.setChecked(true);
    }

    //세 번쨰 버튼과 연결된 메서드
    //모든 체크박스의 상태를 체크 해제 상태로 설정한다.
    public void btn3Method(View view) {
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
    }

    //네 번째 버튼과 연결된 메서드
    //모든 체크박스의 상태를 반전한다.
    public void btn4Method(View view) {
        checkBox1.toggle();
        checkBox2.toggle();
        checkBox3.toggle();
    }

    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            //체크 상태가 변경된 체크박스의 id를 가져온다
            int i = buttonView.getId();

            switch (i) {
                case R.id.checkBox:
                    if (isChecked == true) {
                        textView.setText("첫 번째 체크박스가 체크되었습니다.");
                    } else {
                        textView.setText("첫 번째 체크가 체크 해제 되었습니다");
                    }
                    break;
                case R.id.checkBox2:
                    if (isChecked == true) {
                        textView.setText("두 번째 체크박스가 체크되었습니다");
                    } else {
                        textView.setText("두 번째 체크가 체크 해제 되었습니다");
                    }
                    break;
                case R.id.checkBox3:
                    if (isChecked == true) {
                        textView.setText("세 번째 체크박스가 체크되었습니다");
                    } else {
                        textView.setText("세 번째 체크가 체크 해제 되었습니다");
                    }
                    break;

            }
        }
    }
}