package com.androidbasic.a18spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //스피너 구성을 위한 문자열 배열
    String [] data1 = {
            "스피너1","스피너2","스피너3","스피너4","스피너5","스피너6","스피너7","스피너8","스피너9","스피너10","스피너11"
    };

    //뷰의 주소값을 담을 참조변수
    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 뷰의 주소값을 담는다.
        spinner = (Spinner)findViewById(R.id.spinner);
        textView = (TextView)findViewById(R.id.textView);

        //어뎁터를 생성한다.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,data1);
        //드롭다운으로 나타나는 항목 리스트의 뷰
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 어뎁터를 스피너에 적용한다.
        spinner.setAdapter(adapter);

        //리스너 세팅
        SpinnerListener spinnerListener = new SpinnerListener();
        spinner.setOnItemSelectedListener(spinnerListener);
    }
    public void btnMethod(View view){
        int index = spinner.getSelectedItemPosition();
        textView.setText("선택된 항목 : " + data1[index]);
    }

    class SpinnerListener implements AdapterView.OnItemSelectedListener{
        @Override
        //사용자가 항목을 선택했을때 호출되는 메서드
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            textView.setText(data1[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}