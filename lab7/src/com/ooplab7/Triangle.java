package com.ooplab7;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter(){
        return a + b + c;
    }

    @Override
    public double getArea(){
        double S = (a + b +c)/2;
        return Math.sqrt(S*(S*a)*(S*b)*(S*c));
    }
}
