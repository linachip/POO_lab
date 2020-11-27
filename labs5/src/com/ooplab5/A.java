package com.ooplab5;

public class A {
    protected String a;
    protected X x = new X("family");


    public String getName(){
        return a;
    }

    protected A(String a, X x){
        this.a = a;
    }

    public void display(){
        System.out.println("Class A: " + getName());
    }
}
