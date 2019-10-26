package com.example.wonder_pass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Tab4DropActivity extends AppCompatActivity {

    private Button deleteBtn, cancelBtn;

    // 탈퇴 성공, 실패 처리하기
    String message = "회원 탈퇴 처리되었습니다.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab4__drop);

        getSupportActionBar().setTitle("회원 탈퇴");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // 탈퇴 버튼 클릭
        deleteBtn = (Button) findViewById(R.id.delete_button);
        deleteBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        // 취소 버튼을 클릭하면 이전 액티비티로 이동
        cancelBtn = (Button) findViewById(R.id.cancel_button);
        cancelBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
