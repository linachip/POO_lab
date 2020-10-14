package com.ooplab1;

public class Student {
    private String name;
    private int age;
    private float mark;

    Student(String name, int age, float mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }


    public String getName(){
        return this.name;
    }
    public int getAge(){
        
        return this.age;
    }
    public float getMark(){
        
        return this.mark;
    }
}

