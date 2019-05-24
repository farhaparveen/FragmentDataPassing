package com.example.fragmentdatapassing;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentTwo extends Fragment {

    Button btn;
    Bridge bridge;
    EditText et;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_two, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bridge = (Bridge) getActivity();
        et = getActivity().findViewById(R.id.editTxtFrag2);
        btn = getActivity().findViewById(R.id.editBtnFrag2);
        try {

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bridge.sendDataFromFrag2ToFrag1(et.getText().toString());
                }
            });
        } catch (Exception f) {
        }
    }

    public void receiveFromFragemntOne(String data) {
        et.setText(data);

    }
}
