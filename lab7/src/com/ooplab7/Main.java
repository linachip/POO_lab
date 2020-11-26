package com.ooplab7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Figure triangle = new Triangle(6, 8, 3);
		Figure square = new Square(12);
		Figure rectangle = new Rectangle(15, 6);

		ArrayList<Figure> figures = new ArrayList<>();
		figures.add(triangle);
		figures.add(square);
		figures.add(rectangle);

		Figure circle = new Figure() {
			final double r = 5;

			public double getPerimeter() {
				return 2 * Math.PI * r;
			}

			public double getArea() {
				return r * r * Math.PI;
			}
		};
		figures.add(circle);
		System.out.println("Circle perimeter: " + circle.getPerimeter());
		System.out.println("Circle area: " + circle.getArea());

		FigureController figureController = new FigureController();

		System.out.println("The largest perimeter: " + figureController.getMaxFiguresPerimeter(figures));
		System.out.println("The largest area: " + figureController.getMaxFiguresArea(figures));
	}
}