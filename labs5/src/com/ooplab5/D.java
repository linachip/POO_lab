package com.ooplab5;

public class D extends C {
    protected String d;
    protected X x = new X("child");

    protected D (String a, X x){
        super(a, x);
    }

    @Override
    public void display() {
        super.display();
        x.display();
    }
}
