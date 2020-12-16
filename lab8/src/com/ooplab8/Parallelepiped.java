package com.ooplab8;

public class Parallelepiped implements GeometricBody {
    private double h;
    private double w;
    private double l;

    public Parallelepiped(double h, double w, double l){
        this.h = h;
        this.w = w;
        this.l = l;
    }

    @Override
    public double getSurface() {
        return 2 * (h * w + w * l + l * h);
    }

    @Override
    public double getVolume() {
        return h * w *l;
    }
}
