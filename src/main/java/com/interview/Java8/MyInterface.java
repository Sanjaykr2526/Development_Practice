package com.interview.Java8;

@FunctionalInterface
public interface MyInterface {
    void method1();
//    void method4();
    default void method2()
    {

    }

    static void method3()
    {

    }
}
