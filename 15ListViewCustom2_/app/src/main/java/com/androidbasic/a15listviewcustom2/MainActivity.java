package com.androidbasic.a15listviewcustom2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    //리스트뷰 항목에 세팅한 데이터
    int[] imgRes = {
            R.drawable.imgflag1, R.drawable.imgflag2, R.drawable.imgflag3, R.drawable.imgflag4, R.drawable.imgflag5, R.drawable.imgflag6, R.drawable.imgflag7, R.drawable.imgflag8,
    };

    String[] data1 = {
            "토고", "프랑스", "스위스", "스페인", "일본", "독일", "브라질", "대한민국"
    };

    String[] data2 = {
            "togo", "france", "swiss", "spain", "japan", "germen", "brazil", "Korea"
    };

    //뷰의 주소 값을 담을 참조 변수
    ListView listView;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소값을 받아온다.

        listView = (ListView) findViewById(R.id.list1);
        textView3 = (TextView) findViewById(R.id.textView3);

        //데이터를 가지고있는 어뎁터 세팅한다.
        ArrayList<HashMap<String, Object>> data_list = new ArrayList<HashMap<String, Object>>();

        //데이터를 담는다
        for (int i = 0; i < imgRes.length; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("flag", imgRes[i]);
            map.put("data1", data1[i]);
            map.put("data2", data2[i]);
            data_list.add(map);
        }
        //해시 맵 객체에 데이터를 저장할때 사용한 이름 배열
        String[] keys = {
                "flag", "data1", "data2"
        };
        int[] ids = {
                R.id.imageView, R.id.textView, R.id.textView2
        };

        //어뎁터를 만들어준다.

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,data_list,R.layout.row,keys,ids);
        listView.setAdapter(simpleAdapter);

        //리스터 세팅
        ListListener listListener = new ListListener();
        listView.setOnItemClickListener(listListener);
    }

    //리스트뷰의 항목을 터치하면 반응하는 리스너
    class ListListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            textView3.setText(data1[position]);
        }
    }
}