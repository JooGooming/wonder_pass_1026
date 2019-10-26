package com.example.wonder_pass;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Tab4Info_changePW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab4_change_pw);

        getSupportActionBar().setTitle("비밀번호 변경");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
