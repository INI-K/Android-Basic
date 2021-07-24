package com.androidbasic.a13listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소값을 담을 참조변수
    ListView list1;

    TextView text1;

    String[] data1 =

            {
                    "리스트1", "리스트2", "리스트3", "리스트4", "리스트5", "리스트6",
                    "리스트7", "리스트8", "리스트9", "리스트10", "리스트11", "리스트12", "리스트13",
                    "리스트14", "리스트15", "리스트16", "리스트17", "리스트18", "리스트19",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소값을 얻어옴

        list1 = (ListView)findViewById(R.id.list1);
        text1 = (TextView)findViewById(R.id.textView);

        //몇개의 항목을 보여줄것인가? => 배열이나 리스트의 항목의 갯수
        //각 항목에 어떤 데이터를 보여줄것인가? => 배열이나 리스트에 들어있는 값
        //각 항목은 어떤 모양으로 보여줄것인가? =>레이아웃

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data1);

        //리스뷰에 어뎁터를 세팅한다.
        list1.setAdapter(adapter);

        //리스너를 설정한다.
        ListListener listListener = new ListListener();
        list1.setOnItemClickListener(listListener);
    }

    class ListListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            text1.setText(data1[position]);
        }
    }
}