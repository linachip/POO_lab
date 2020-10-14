package com.ooplab1;

public class Monitor{

    public String name;
    public String color;
    public float dimension;
    public int resolution;
    public int resolution2;

    Monitor(String name, String color, float dimension, int resolution, int resolution2) {
        this.name = name;
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
        this.resolution2 = resolution2;
    }

    public void monitorParameters(){
        System.out.println("Model " + this.name);
        System.out.println("Color " + this.color);
        System.out.println("Dimension " + this.dimension);
        System.out.println("Resolution " + this.resolution);
        System.out.println("Resolution " + this.resolution2);
    }

}

