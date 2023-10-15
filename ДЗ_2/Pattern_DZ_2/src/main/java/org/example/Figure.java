package org.example;

public abstract class Figure implements FigureMethods
{
    private Integer id;
    private String name;
    private Float x;
    private Float y;
    private Float z;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Float getX()
    {
        return x;
    }

    public void setX(Float x)
    {
        this.x = x;
    }

    public Float getY()
    {
        return y;
    }

    public void setY(Float y)
    {
        this.y = y;
    }

    public Float getZ()
    {
        return z;
    }

    public void setZ(Float z)
    {
        this.z = z;
    }



    public Figure(Integer id, String name, Float x, Float y, Float z)
    {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Figure(Integer id, String name, Float x, Float y)
    {
        this(id, name, x, y, null);
    }
    public Figure(Integer id, String name, Float x)
    {
        this(id, name, x, null, null);
    }
    public Figure(Integer id, String name)
    {
        this(id, name, null, null, null);
    }
    public Figure(Integer id)
    {
        this(id, null, null, null, null);
    }
    public Figure()
    {
        this(null, null, null, null, null);
    }
}
