package org.example.Figures;

import org.example.Figure;

public class Rectangle extends Figure
{
    @Override
    public Figure drawFigure(Figure figure)
    {
        figure.setName("квадрат");
        figure.setX(0.2F);
        figure.setY(0.2F);
        figure.setZ(0.2F);
        // логика рисования фигуры
        return figure;
    }
}
