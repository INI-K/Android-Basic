package com.androidbasic.a14listviewcustom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //리스트 뷰를 구성하기 위한 문자열 배열
    String [] data = {
            "데이터1","데이터2","데이터3","데이터4","데이터5","데이터6",
    };
    //뷰의 주소 값을 담을 참조변수
    ListView listView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소 값을 받아돈다.
        listView = (ListView)findViewById(R.id.list1);
        textView2 = (TextView)findViewById(R.id.textView2);

        //어뎁터 생성
        ArrayAdapter<String> adapter = new ArrayAdapter<String >(this, R.layout.row,R.id.textView,data);

        //어뎁터 세팅
        listView.setAdapter(adapter);

        //리스너 세팅
        ListListener listListener = new ListListener();
        listView.setOnItemClickListener(listListener);

    }
    //리스트뷰 리스너
    class ListListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            textView2.setText(data[position]);
        }
    }
}