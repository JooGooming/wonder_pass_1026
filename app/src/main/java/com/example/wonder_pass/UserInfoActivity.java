package com.example.wonder_pass;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

/******************마이페이지 > 회원정보 확인********************/
//test

public class UserInfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

//        getSupportActionBar().setTitle("회원 계정");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기

//        Toolbar toolbar = (Toolbar) findViewById(R.id.app_toolbar);
//        setTitle("원더패스");
//        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);


        Button u_modification = findViewById(R.id.btn_usermodi);
        //Button u_modification.setClickable(true);
        u_modification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(new Intent(intent));
            }
        });


    }
}
