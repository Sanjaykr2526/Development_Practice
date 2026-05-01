package org.example.Controller;

@FunctionalInterface
public interface MyInterface {
    public void sayHello();
    default void sayBye(){};
    public static void sayGoodBye(){};
}
