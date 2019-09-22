package com.example.wonder_pass;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EditMemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_memo);

        getSupportActionBar().setTitle("메모 추가");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Spinner spi = (Spinner) findViewById(R.id.memo_spinner);

        ArrayList<String> m_CategoryList = new ArrayList<String>();
        m_CategoryList.add("직접입력"); m_CategoryList.add("포털"); m_CategoryList.add("쇼핑");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.memo_spinner_normal_edit, R.id.spinnerText, m_CategoryList);
        adapter.setDropDownViewResource(R.layout.memo_spinner_dropdown);
        spi.setAdapter(adapter);

        final EditText selfInput = (EditText)findViewById(R.id.category_selfInput);
        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 0:
                        selfInput.setVisibility(View.VISIBLE);
                    case 1:
                        selfInput.setVisibility(View.INVISIBLE);
                    case 2:
                        selfInput.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        switch(item.getItemId())
//        {
//            case R.id.memo_spinner:
//                R.id.category_selfInput.setVisibility(View.VISIBLE);
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
