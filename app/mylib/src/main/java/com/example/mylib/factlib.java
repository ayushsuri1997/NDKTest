package com.example.mylib;

public class factlib {

    public native double helloWorld(int num);
    static {
        System.loadLibrary("ndktest");
    }

    public static double callfact(){

        return (new factlib().helloWorld(4));
    }
}
