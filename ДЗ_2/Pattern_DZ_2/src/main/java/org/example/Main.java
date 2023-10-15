package org.example;

import org.example.Figures.Circle;
import org.example.Figures.Rectangle;
import org.example.Figures.Squere;
import org.example.Figures.Triangle;

public class Main {
    public static void main(String[] args)
    {

        Figure triangle = new Triangle();
        triangle.drawFigure(triangle);

        Figure cicle = new Circle();
        cicle.drawFigure(cicle);

        Figure rectangle =  new Rectangle();
        rectangle.drawFigure(rectangle);

        Figure squere = new Squere();
        squere.drawFigure(squere);

    }
}