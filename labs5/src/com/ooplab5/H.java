package com.ooplab5;

public class H extends G {
    protected String h;
    protected X x = new X("spring");

    protected H(String a, X x){
        super(a, x);
    }

    @Override
    public void display() {
        super.display();
        x.display();
    }
}
