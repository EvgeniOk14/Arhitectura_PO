package org.example.Figures;

import org.example.Figure;

public class Squere extends Figure
{
    @Override
    public Figure drawFigure(Figure figure)
    {
        figure.setName("квадрат");
        figure.setX(2.0F);
        figure.setY(2.0F);
        figure.setZ(2.0F);
        // логика рисования фигуры
        return figure;
    }
}