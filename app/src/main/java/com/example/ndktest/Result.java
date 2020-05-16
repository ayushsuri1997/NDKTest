package com.example.ndktest;

public class Result {

    public native double helloWorld(int num);
    static {
        System.loadLibrary("ndktest");
    }

    public static double callfact(){

        return (new Result().helloWorld(4));
    }
}
