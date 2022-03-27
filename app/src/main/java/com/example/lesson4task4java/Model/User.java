package com.example.lesson4task4java.Model;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
