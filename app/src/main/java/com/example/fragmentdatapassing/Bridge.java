package com.example.fragmentdatapassing;

public interface Bridge {
    void sendDataFromFrag1ToFrag2(String data);
    void sendDataFromFrag2ToFrag1(String data);
}
