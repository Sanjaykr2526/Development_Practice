package org.example.entity;

import java.util.Objects;

public class Person {

    // create a custom Person class (with name and age )

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this==o)
            return true;
        if(o==null || getClass()!=o.getClass())
            return false;

        Person p=(Person) o;
        return age==p.age && Objects.equals(name,p.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name,age);
    }
}
