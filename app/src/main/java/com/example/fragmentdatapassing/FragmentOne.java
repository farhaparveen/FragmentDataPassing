package com.example.fragmentdatapassing;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentOne extends Fragment {
    Bridge bridge;
    Button btn;
    EditText et;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bridge = (Bridge) getActivity();
        btn=getActivity().findViewById(R.id.editBtnFrag1);
        et = getActivity().findViewById(R.id.editTxtFrag1);
        try {


            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bridge.sendDataFromFrag1ToFrag2(et.getText().toString());
                }
            });

        } catch (Exception r) {

        }


    }

    public void receiveFromFragemntTwo(String data) {
        et.setText(data);

    }
}
