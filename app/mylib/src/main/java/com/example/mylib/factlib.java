package com.example.mylib;

public class factlib {

    public native double helloWorld(int num);
    static {
        System.loadLibrary("ndktest");
    }

    public static void callfact(int n){
        new factlib().helloWorld(n);
    }
}
