package com.example.wonder_pass;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Tab4Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Tab4Fragment";

    // 2개의 카드뷰 객체 생성
    private CardView infoCard, dropCard;
    private TextView phoneAuth, loginRecord, logOut;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4_mypage,container,false);

        // define cards
        infoCard = (CardView) view.findViewById(R.id.info_card);
        dropCard = (CardView) view.findViewById(R.id.drop_card);
        // add click listener to the cards
        infoCard.setOnClickListener(this);
        dropCard.setOnClickListener(this);

        // 텍스트에도 똑같이
        phoneAuth = (TextView) view.findViewById(R.id.phone_auth);
        phoneAuth.setOnClickListener(this);
        loginRecord = (TextView) view.findViewById(R.id.login_record);
        loginRecord.setOnClickListener(this);
        logOut = (TextView) view.findViewById(R.id.logout);
        logOut.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch(view.getId()) {
            case R.id.info_card :
                i = new Intent(Tab4Fragment.this.getActivity(), Tab4InfoActivity.class);
                startActivity(i);
                break;

            case R.id.phone_auth :
                i = new Intent(Tab4Fragment.this.getActivity(), Tab4PhoneAuthActivity.class);
                startActivity(i);
                break;
            case R.id.login_record :
                i = new Intent(Tab4Fragment.this.getActivity(), Tab4LoginRecordActivity.class);
                startActivity(i);
                break;
            case R.id.logout :
                openDialog();
                break;

            case R.id.drop_card :
                i = new Intent(Tab4Fragment.this.getActivity(), Tab4DropActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }

    public void openDialog(){
        LogoutDialog dialog = new LogoutDialog();
        dialog.show(getFragmentManager(), "logout_dialog");
    }

}
