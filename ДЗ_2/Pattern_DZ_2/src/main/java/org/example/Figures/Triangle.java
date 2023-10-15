package org.example.Figures;

import org.example.Figure;

public class Triangle extends Figure
{
    @Override
    public Figure drawFigure(Figure figure)
    {
        figure.setName("треугольник");
        figure.setX(1.5F);
        figure.setY(1.5F);
        figure.setZ(1.5F);
        // логика рисования фигуры
        return figure;
    }
}
