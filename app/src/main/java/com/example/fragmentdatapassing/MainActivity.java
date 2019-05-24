package com.example.fragmentdatapassing;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Bridge {

    FragmentOne fragmentOne = new FragmentOne();
    FragmentTwo fragmentTwo = new FragmentTwo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frag1, fragmentOne);
        transaction.add(R.id.frag2, fragmentTwo);

        transaction.commit();

    }

       @Override
    public void sendDataFromFrag1ToFrag2(String data) {
        fragmentTwo.receiveFromFragemntOne(data);
    }

    @Override
    public void sendDataFromFrag2ToFrag1(String data) {
        fragmentOne.receiveFromFragemntTwo(data);
    }
}
