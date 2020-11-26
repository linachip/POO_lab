package com.ooplab7;

public class Rectangle extends Figure {
    private double L;
    private double l;

    public Rectangle(double L, double l){
        this.L = L;
        this.l = l;
    }

    @Override
    public double getPerimeter() {
        return 2 * L + 2 * l;
    }

    @Override
    public double getArea() {
        return 2 * L * l;
    }
}
