package org.techtown.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //부모 클래스에 있는 onCreat()함수를 호출
        setContentView(R.layout.activity_main);
        //setContentView : 화면에 무엇을 보여줄 것인가
        //() : 화면 구성 요소에 대한 정보
    }
}