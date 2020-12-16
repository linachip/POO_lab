package com.ooplab8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	GeometricBody cube = new Cube(6);
	GeometricBody parallelepiped = new Parallelepiped(8, 15, 12);
	GeometricBody sphere = new Sphere(9);

	ArrayList<GeometricBody> geometricBodies = new ArrayList<>();
	geometricBodies.add(cube);
	geometricBodies.add(parallelepiped);
	geometricBodies.add(sphere);

	System.out.println("Cube has: " + "surface " + cube.getSurface() + " volume " + cube.getVolume());
	System.out.println("Parallelepiped has: " + "surface " + parallelepiped.getSurface() + " volume " + parallelepiped.getVolume());
	System.out.println("Sphere has: " + "surface " + sphere.getSurface() + " volume " + sphere.getVolume());
    }
}
