package com.interview.ThreadPractice;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("RUNNING state");
        try {
            Thread.sleep(2000); // Thread is sleeping for 2 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void main(String[] args) throws InterruptedException {
        // Main thread is executing the main method
        MyThread t1=new MyThread(); // NEW state
        System.out.println(t1.getState());
        t1.start(); // Runnable state-> Running state
        System.out.println(t1.getState()); // RUNNABLE state
        System.out.println(Thread.currentThread().getName()); // Main thread is executing the main method
        Thread.sleep(1000); // Main thread is sleeping for 1 second
        System.out.println(t1.getState());
        t1.join(); // Main thread is waiting for t1 to finish
        System.out.println(t1.getState());
    }
}
