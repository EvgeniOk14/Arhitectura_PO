package ru.geekbrains.lesson1.store3d.modelelements;

public class Angle3D
{
    private double angleX; // Угол вокруг оси X
    private double angleY; // Угол вокруг оси Y
    private double angleZ; // Угол вокруг оси Z

    public Angle3D(double angleX, double angleY, double angleZ)
    {
        this.angleX = angleX;
        this.angleY = angleY;
        this.angleZ = angleZ;
    }

    public double getAngleX()
    {
        return angleX;
    }

    public void setAngleX(double angleX)
    {
        this.angleX = angleX;
    }

    public double getAngleY()
    {
        return angleY;
    }

    public void setAngleY(double angleY)
    {
        this.angleY = angleY;
    }

    public double getAngleZ()
    {
        return angleZ;
    }

    public void setAngleZ(double angleZ)
    {
        this.angleZ = angleZ;
    }

    @Override
    public String toString()
    {
        return "Angle3D [X=" + angleX + ", Y=" + angleY + ", Z=" + angleZ + "]";
    }
}
