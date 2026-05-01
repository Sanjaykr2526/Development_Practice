package com.interview.Java8;

public class Main {
    static void main(String[] args) {
        MyInterface myInterface = new ChildClass();
        myInterface.method1();

        MyInterface myInterface2 = new ChildClass2();
        myInterface2.method1();

//        MyInterface mi = new MyInterface() {
//            @Override
//            public void method1() {
//                System.out.println("Method 1 Implemented in Anonymous Class");
//            }
//        };
//
//        MyInterface mi1 = new MyInterface() {
//            @Override
//            public void method1() {
//                System.out.println("Method 2 Implemented in Anonymous Class");
//            }
//        };

        MyInterface m1= ()-> System.out.println("Method 1 Implemented in Lambda Expression");
        m1.method1();
    }
}
