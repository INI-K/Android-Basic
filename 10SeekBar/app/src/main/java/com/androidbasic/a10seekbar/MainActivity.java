package com.androidbasic.a10seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    //뷰의 주소값을 담을 참조변수
    SeekBar seekBar1, seekBar2;
    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar1 = (SeekBar) findViewById(R.id.seekBar);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        SeekBarListener listener = new SeekBarListener();
        seekBar1.setOnSeekBarChangeListener(listener);
        seekBar2.setOnSeekBarChangeListener(listener);


    }

    public void btn1Method(View v) {
        seekBar1.incrementProgressBy(5);
        seekBar2.incrementProgressBy(5);
    }

    public void btn2Method(View v) {
        seekBar1.incrementProgressBy(-1);
        seekBar2.incrementProgressBy(-1);
    }

    public void btn3Method(View v) {
        seekBar1.setProgress(8);
        seekBar2.setProgress(3);
    }

    public void btn4Method(View v) {
        int value1 = seekBar1.getProgress();
        int value2 = seekBar2.getProgress();

        textView1.setText("seek1 : " + value1);
        textView1.setText("seek2 : " + value2);
    }

    class SeekBarListener implements SeekBar.OnSeekBarChangeListener {
        @Override
        //현재 값을 변경 시켯을 때 호출되는 리스너
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int id = seekBar.getId();

            switch (id) {
                case R.id.seekBar:
                    textView1.setText("첫번째 SeekBar : " + progress);
                    break;
                case R.id.seekBar2:
                    textView1.setText("두번째 SeekBar : " + progress);
                    break;
            }
            if(fromUser == true){
                textView2.setText("사용자에 의해 변경되었습니다.");
            }else {
                textView2.setText("코드를 통해 변경되었습니다.");
            }
        }
        @Override
        //값을 변경하기 위해 터치하면 호출되는 메서드
        public void onStartTrackingTouch(SeekBar seekBar) {
            int id = seekBar.getId();

            switch (id) {
                case R.id.seekBar:
                    textView2.setText("첫번째 SeekBar를 터지하였습니다");
                    break;
                case R.id.seekBar2:
                    textView2.setText("두번째 SeekBar를 터치하였습니다.");
                    break;
            }
        }
        @Override
        //값이 변하고 터치를 때면 호출되는 메서드
        public void onStopTrackingTouch(SeekBar seekBar) {
            int id = seekBar.getId();

            switch (id) {
                case R.id.seekBar:
                    textView2.setText("첫번째 SeekBar를 떼었습니다.");
                    break;
                case R.id.seekBar2:
                    textView2.setText("두번째 SSeekBar를 떼었습니다.");
                    break;
            }
        }
    }
}