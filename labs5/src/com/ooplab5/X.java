package com.ooplab5;

public class X {
    private final String someName;

    public String getName(){
        return someName;
    }

    protected X(String someName){

        this.someName = someName;
    }

    public void display(){
        System.out.println("Class X: " + getName());
    }
}
