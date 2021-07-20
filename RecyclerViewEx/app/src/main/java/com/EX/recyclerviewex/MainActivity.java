package com.EX.recyclerviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<>();

        //데이터 생성
        for(int i = 0 ; i < 100 ; i++){
            arrayList.add("테스트 : " + i + "번째");
        }

        RecyclerView recyclerView  = (RecyclerView)findViewById(R.id.recycler1);

        //리니어 Default
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //그리드뷰
       // GridLayoutManager layoutManager = new GridLayoutManager(this, 10);

        //리니어 가로정렬
        //layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        recyclerView.setLayoutManager(layoutManager);

        SimpleTextAdapter simpleTextAdapter = new SimpleTextAdapter(arrayList);
        recyclerView.setAdapter(simpleTextAdapter);

    }
}