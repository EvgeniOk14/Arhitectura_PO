package ru.geekbrains.lesson1.store3d.modelelements;

public class Camera
{
    private int id;
    private static int counter = 0;
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle)
    {
        this.location = location;
        this.angle = angle;
    }
    public Camera(Point3D location)
    {
        this(location, null);
    }
    public Camera()
    {
        this(null, null);
    }

    public Point3D getLocation()
    {
        return location;
    }

    public void setLocation(Point3D location)
    {
        this.location = location;
    }

    public Angle3D getAngle()
    {
        return angle;
    }

    public void setAngle(Angle3D angle)
    {
        this.angle = angle;
    }
    {
        id = ++counter;
    }

        private void rotate(Angle3D angle, double displacement)
            {
                double currentAngelX = angle.getAngleX();
                double currentAngelY = angle.getAngleY();
                double currentAngelZ = angle.getAngleZ();

                double newAngelX = currentAngelX + displacement;
                double newAngelY = currentAngelY + displacement;
                double newAngelZ = currentAngelZ = displacement;

                Angle3D angel = new Angle3D(newAngelX, newAngelY, newAngelZ);

                angel.setAngleX(newAngelX);
                angel.setAngleY(newAngelY);
                angel.setAngleZ(newAngelZ);

            }
        private void move(Point3D point, double displesement)
        {
            // Получить текущие координаты объекта
            double currentX = point.getX();
            double currentY = point.getY();
            double currentZ = point.getZ();

            // Добавить смещение к текущим координатам
            double newX = currentX + displesement;
            double newY = currentY + displesement;
            double newZ = currentZ + displesement;

            // Установить новые координаты объекта
            Point3D point3D = new Point3D();
            point3D.setX(newX);
            point3D.setY(newY);
            point3D.setZ(newZ);

        }
}
