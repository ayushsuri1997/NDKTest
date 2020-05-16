package com.example.mylib;

public class factlib {

    public native double helloWorld(int num);
    static {
        System.loadLibrary("ndktest");
    }

    public static double callfact(int n){
        return (new factlib().helloWorld(n));
    }
}
