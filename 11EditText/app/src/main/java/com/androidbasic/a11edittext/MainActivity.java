package com.androidbasic.a11edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소값을 담을 참조변수

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.textView);

        EnterListener listener = new EnterListener();
        editText.setOnEditorActionListener(listener);

        WathcherClass wathcherClass = new WathcherClass();
        editText.addTextChangedListener(wathcherClass);
    }

    public void btn1Method(View v){
        editText.setText("새롭게 설정한 문자열");
    }

    public void btn2Method(View v){
       String str =  editText.getText().toString();
       textView.setText("입력한 문자열 : " + str);
    }

    class EnterListener implements TextView.OnEditorActionListener{
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            String str = v.getText().toString();

            textView.setText("입력한 문자열 : "+ str);

            return false;
        }
    }

    class WathcherClass implements TextWatcher{
        @Override
        //문자열 값이 변경 되었을 때
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            textView.setText("문자열 변경 중 : " + s);
        }

        @Override
        //문자열 값이 변경되기 전
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        //문자열 값이 변경된 이후
        public void afterTextChanged(Editable s) {

        }
    }
}