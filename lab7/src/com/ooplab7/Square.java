package com.ooplab7;

public class Square extends Figure {
    private double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
