package com.interview.ThreadPractice;

public class World extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello from World thread");
        }
    }
}
