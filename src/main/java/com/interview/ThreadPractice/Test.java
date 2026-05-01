package com.interview.ThreadPractice;

public class Test {

    static void main(String[] args) {

        World t1=new World(); // New state

        t1.start(); // Runnable state-> Running state
        System.out.println(Thread.currentThread().getName());

//        for()
//        {
//            System.out.println("Hello from main thread");
//        }
    }
}
