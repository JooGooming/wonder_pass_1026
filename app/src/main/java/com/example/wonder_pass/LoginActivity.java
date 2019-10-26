package com.example.wonder_pass;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_ID,  TextInputEditText_password;
    LinearLayout LinearLayout_login;
    String idOK = "wonder12";
    String passwordOK = "1234";

    String inputId = "";
    String inputPassword = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //login xml파일 안의 TIE_ID를 전역변수 TIE_ID와 매칭시킴
        //findViewById : 컴포넌트(TIE_ID)를 찾아라!
        TextInputEditText_ID = findViewById(R.id.TextInputEditText_ID);
        TextInputEditText_password = findViewById(R.id.TextInputEditText_password);
        LinearLayout_login = findViewById(R.id.LinearLayout_login);

        //1. 값을 가져온다. - 검사( wonder12 / 1234)
        //2. 클릭을 감지한다.
        //3. 1번의 값을 다음 액티비티로 넘긴다.

        //검사 : ID와 password의 값이 동일하면 버튼을 누를 수 있게 해준다.

        LinearLayout_login.setClickable(false);
        TextInputEditText_ID.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (charSequence != null) {
                    //null이 아닐때만(값이 들어있으면) id를 스트링으로 받는다.
                    inputId = charSequence.toString();
                    LinearLayout_login.setEnabled(validation());
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        TextInputEditText_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                //입력한 pw가 null이 아니면 pw를 받아라
                if(charSequence != null) {
                    inputPassword = charSequence.toString();
                    LinearLayout_login.setEnabled(validation());
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        LinearLayout_login.setClickable(true);
        LinearLayout_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = TextInputEditText_ID.getText().toString();
                String password = TextInputEditText_password.getText().toString();

               // 여기(MA)에서 MainActivity클래스로 넘긴다.
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                intent.putExtra("id", id);
//                intent.putExtra("password",password);
                //~~를 실행해라!
                startActivity(intent);





            }
        });

    }
    //조건 검사하는 함수
    public boolean validation() {
        Log.d("SENTI",inputId + "/" + inputPassword + "/" + (inputId.equals(idOK))+ "/" +(inputPassword.equals(passwordOK) ));
        return inputId.equals(idOK) && inputPassword.equals(passwordOK);

        //자바에서 문자열비교는 .equals

    }

}
