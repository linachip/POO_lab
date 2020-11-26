package com.ooplab7;

import java.util.ArrayList;

public class FigureController {
    public Figure getMaxFiguresPerimeter(ArrayList<Figure> figures) {
        int index = 0;
        Figure largestFigure = null;

        for(Figure figure : figures) {
            double perimeter = figure.getPerimeter();
            if (perimeter > index) { index = (int) perimeter;
                largestFigure = figure;
            }
        } return largestFigure;
    }
    public Figure getMaxFiguresArea(ArrayList<Figure> figures) {
        int index = 0;
        Figure largestFigure = null;

        for(Figure figure : figures) {
            double area = figure.getArea();
            if (area > index) { index = (int) area;
                largestFigure = figure;
            }
        } return largestFigure;
    }
}
