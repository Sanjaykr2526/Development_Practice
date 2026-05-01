package org.example.Controller;

import org.example.entity.Person;

import java.util.HashMap;

public class Java8Practice {

    public static void main(String[] args) {
        // 1. create a custom Person class (with name and age) as a key in a HashMap.
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Sanjay", 26);
        Person p2 = new Person("Sanjay", 26);
        map.put(p1, "developer");
        System.out.println(map.get(p2));
    }
}
