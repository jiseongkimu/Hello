package org.techtown.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //부모 클래스에 있는 onCreat()함수를 호출
        setContentView(R.layout.activity_main);
        //setContentView : 화면에 무엇을 보여줄 것인가
        //() : 화면 구성 요소에 대한 정보(화면에 보여줄 대상이 되는 XML의 위치를 지정)
    }
    public void onButton1Clicked(View v){
        Toast.makeText(this, "확인1 버튼이 눌렸다.",Toast .LENGTH_LONG).show();
    }
    public void onButton2Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }
    public void onButton3Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(myIntent);

        //
    }

}