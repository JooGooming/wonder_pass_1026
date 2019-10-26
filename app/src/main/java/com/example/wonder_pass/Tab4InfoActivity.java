package com.example.wonder_pass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Tab4InfoActivity extends AppCompatActivity {
    String message = "수정되었습니다.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab4__info);

        getSupportActionBar().setTitle("회원 정보");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // 비밀번호 변경하기 버튼 클릭
        Button changeButton = (Button) findViewById(R.id.change_pw);
        changeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // 새로운 화면으로 넘어가도록 한다.
                Intent i = new Intent(Tab4InfoActivity.this, Tab4Info_changePW.class);
                // 인텐트 실행
                Tab4InfoActivity.this.startActivity(i);
            }
        });

        // 수정하기 버튼 클릭
        Button saveButton = (Button) findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
