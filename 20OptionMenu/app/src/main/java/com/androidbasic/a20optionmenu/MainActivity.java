package com.androidbasic.a20optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //뷰의 주소값을 담을 참조변수

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    //액티비티가 화면에 나타날 때 메뉴구성을 위해서 호출하는 메서드
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        //xml를 통해 메뉴를 구성 할 수 있는 객체를 추출
//        MenuInflater inflater = getMenuInflater();
//        //xml을 이용해 메뉴를 구성한다.
//        inflater.inflate(R.menu.option_menu, menu);
//
        menu.add(Menu.NONE,Menu.FIRST,Menu.NONE,"코드메뉴1");
        //menu.add(Menu.NONE,Menu.FIRST + 1,Menu.NONE,"코드메뉴2");

        Menu sub = menu.addSubMenu("코드메뉴2");
        sub.add(Menu.NONE,Menu.FIRST + 10,Menu.NONE,"코드 서브메뉴1");
        sub.add(Menu.NONE,Menu.FIRST + 20,Menu.NONE,"코드 서브메뉴2");

        menu.add(Menu.NONE,Menu.FIRST + 2,Menu.NONE,"코드메뉴3");

        return true;
    }

    //옵션 메뉴의 항목을 터치하면 호출되는 메서드
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //사용자가 터치한 항목 객체의 id를 추출한다
        int id = item.getItemId();
        //분기

//        switch (id) {
//            case R.id.item1:
//                textView.setText("메뉴1을 눌렀습니다");
//                break;
//            case R.id.item2_1:
//                textView.setText("서브 메뉴1을 눌렀습니다");
//                break;
//            case R.id.item2_2:
//                textView.setText("서브 메뉴2를 눌렀습니다.");
//                break;
//            case R.id.Item3:
//                textView.setText("메뉴3을 눌렀습니다");
//                break;
//        }

        switch (id){
            case Menu.FIRST :
                textView.setText("코드 메뉴1를 눌렀습니다.");
                break;
            case Menu.FIRST + 10:
                textView.setText("코드 서브메뉴1을 눌렀습니다.");
                break;
            case Menu.FIRST + 20:
                textView.setText("코드 서브메뉴2를 눌렀습니다.");
                break;
            case Menu.FIRST + 2:
                textView.setText("코드 메뉴3을 눌렀습니다.");
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}