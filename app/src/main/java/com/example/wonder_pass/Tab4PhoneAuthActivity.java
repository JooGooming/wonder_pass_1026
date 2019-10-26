package com.example.wonder_pass;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Tab4PhoneAuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab4_phone_auth);

        getSupportActionBar().setTitle("휴대폰 인증");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
