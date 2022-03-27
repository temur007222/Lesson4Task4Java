package com.example.lesson4task4java.Model;

import java.io.Serializable;

public class Member implements Serializable {
    String name;
    int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
