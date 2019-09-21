package com.example.wonder_pass;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

public class Tab4Fragment extends Fragment {
    private static final String TAG = "Tab4Fragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4_mypage,container,false);

        //계정정보 > 수정완료버튼 > 메인페이지로 전환
        LinearLayout LinearLayout_userinfo = view.findViewById(R.id.LinearLayout_userinfo);
        LinearLayout_userinfo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                getActivity().startActivity(new Intent(getActivity(), UserInfoActivity.class));
            }
        });

        //로그아웃 > 다시한번 확인하는 팝업창
        TextView logout = view.findViewById(R.id.logout);
        logout.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout_Dialog();
            }
        }));

        return view;
    }

    //로그아웃 확인 팝업창
    private void logout_Dialog(){
        AlertDialog.Builder alt_bld = new AlertDialog.Builder(getContext());
        alt_bld.setMessage("원더패스에서 로그아웃 하시겠습니까??")
                .setCancelable(false).setPositiveButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // 취소 클릭  -> dialog닫기.다시 마이페이지 메뉴로 돌아옴
//                dialogInterface.cancel();
            }
        }).setNegativeButton("나가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //나가기 클릭 ->  앱 종료
                getActivity().finishAffinity(); //fragment여서 activity를 받아와서 종료해야함.

            }
        });
        AlertDialog alert = alt_bld.create();

        // 대화창 제목 설정
        alert.setTitle("탈퇴 여부 확인");

        alert.setIcon(R.drawable.logo);

        alert.show();


    }


}
