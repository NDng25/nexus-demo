package com.example.nexusdemo;

public class MySum {
    public static void hello(String[] names){
        System.out.println("Hello world");
        System.out.println("Members:");
        for (String i :
                names) {
            System.out.println(i+",");
        }
    }

    public static int add(int a, int b){
        return a+b;
    }
}
