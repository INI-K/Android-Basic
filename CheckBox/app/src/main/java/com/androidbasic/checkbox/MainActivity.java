package com.androidbasic.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    CheckBox checkBox1 ,checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
    }
    //첫 번째 버튼을 누르면 호출되는 메서드
    //체크상태 값을 파악한다.
    public  void btn1Method(View view){
        textView.setText("");

        //체크상태에 따라 플요한 처리를 해준다.
        boolean a1 = checkBox1.isChecked();
        boolean a2 = checkBox2.isChecked();
        boolean a3 = checkBox3.isChecked();

        if(a1 == true){
            textView.append("첫 번째 체크 박스가 체크되어 있습니다 \n");
        }
        if(a2 == true){
            textView.append("두 번째 체크 박스가 체크되어 있습니다\n");
        }
        if(a3 == true){
            textView.append("세 번째 체크 박스가 체크되어 있습니다\n");
        }

    }
    //두 번째 버튼과 연결된 메서드
    //모든 체크박스의 상태를 체크상태를 설정한다.
    public void btn2Method(View view){
        checkBox1.setChecked(true);
        checkBox2.setChecked(true);
        checkBox3.setChecked(true);
    }

    //세 번쨰 버튼과 연결된 메서드
    //모든 체크박스의 상태를 체크 해제 상태로 설정한다.
    public  void  btn3Method(View view){
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
    }

    //네 번째 버튼과 연결된 메서드
    //모든 체크박스의 상태를 반전한다.
    public void  btn4Method(View view){
        checkBox1.toggle();
        checkBox2.toggle();
        checkBox3.toggle();
    }

}