package com.example.wonder_pass;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Tab4LoginRecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab4_login_record);

        getSupportActionBar().setTitle("로그인 기록");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
