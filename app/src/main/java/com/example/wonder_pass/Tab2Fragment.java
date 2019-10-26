package com.example.wonder_pass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_sitelink,container,false);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tab4_change_pw);

      //  Toolbar myToolbar = view.findViewById(R.id.my_toolbar);
//        setSupportActionBar(myToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // ((MainActivity) getActivity()).setTitle("비밀번호 변경");
        // 뒤로가기 버튼, 디폴트로 true만 해도 백버튼이 생김
       // ((MainActivity) getActivity()).setDisplayHomeAsUpEnabled(true);

        return view;
    }


}
