package com.example.wonder_pass;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    private Tab3Fragment mViewModel;

    public static Tab3Fragment newInstance() {
        return new Tab3Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_memo,container,false);

        Spinner spi = (Spinner) view.findViewById(R.id.memo_spinner);

        ArrayList<String> m_CategoryList = new ArrayList<String>();
        m_CategoryList.add("전체보기"); m_CategoryList.add("포털"); m_CategoryList.add("쇼핑");

        ArrayAdapter adapter = new ArrayAdapter(getActivity(), R.layout.memo_spinner_normal, R.id.spinnerText, m_CategoryList);
        adapter.setDropDownViewResource(R.layout.memo_spinner_dropdown);
        spi.setAdapter(adapter);

        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity().getApplicationContext(), EditMemoActivity.class));
            }
        });

        Button button2 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), EditMemoActivity.class));
            }
        });

        return view;
    }
}



