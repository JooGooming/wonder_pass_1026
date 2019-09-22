package com.example.wonder_pass;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private Tab1Fragment mViewModel;

    public static Tab1Fragment newInstance() {
        return new Tab1Fragment();
    }

    private TextView password;
    private TextView _background;
    private TextView timer_text;
    private CountDownTimer _timer;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_password,container,false);

        password = (TextView) view.findViewById(R.id.textView2);
        _background = (TextView) view.findViewById(R.id.textBackground);
        timer_text = (TextView) view.findViewById(R.id.time_second);

        _timer = new CountDownTimer(60*1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer_text.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                timer_text.setText("0");
            }
        };

        final Button button1 = (Button) view.findViewById(R.id.button_print);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                _background.setVisibility(View.VISIBLE);
                password.setVisibility(View.VISIBLE);

                _timer.start();
            }
        });

        return view;
    }
}