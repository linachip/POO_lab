package com.ooplab2;

public class Box {
    private int weight;
    private int width;
    private int depth;
    private float area;
    private float vol;

    Box() {
        this.weight = 1;
        this.width = 1;
        this.depth = 1;
    }

    Box(int a) {
        this.weight = a;
        this.width = a;
        this.depth = a;
    }

    Box(int weight, int width, int depth) {
        this.weight = weight;
        this.width = width;
        this.depth = depth;
    }

    public void BoxCalculations() {
        area = 2 * (weight * width + width * depth + weight * depth);
        vol = weight * width * depth;

        System.out.println("The area of geometric body is " + area);
        System.out.println("The volume of geometric body is " + vol);
    }

    public void ShowBox() {
        System.out.println("weight " + this.weight);
        System.out.println("width " + this.width);
        System.out.println("depth " + this.depth);
    }
}

