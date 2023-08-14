package com.example.thirdmonth_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainFragment extends Fragment {

    private Button btn_f;
    private Button btn_s;
    private TextView tv_m;

    private int numbers;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        InitView();
        InitListener();
    }

    private void InitView() {
        btn_s = requireActivity().findViewById(R.id.btn_second);
        btn_f = requireActivity().findViewById(R.id.btn_first);
        tv_m = requireActivity().findViewById(R.id.tv_zero);
    }

    private void InitListener() {
        btn_f.setOnClickListener(view -> {
            numbers++;
            tv_m.setText(String.valueOf(numbers));
        });
        btn_s.setOnClickListener(view -> {
            numbers--;
            tv_m.setText(String.valueOf(numbers));
//            if (numbers < 1){
//                Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
//            } else {
//            }
        });
    }

}
