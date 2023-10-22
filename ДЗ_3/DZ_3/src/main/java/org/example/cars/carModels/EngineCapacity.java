package org.example.cars.carModels;

public class EngineCapacity
{
    private Double V;

    public EngineCapacity(double V)
    {
        this.V = V;
    }
    public EngineCapacity()
    {

    }

    public Double getV()
    {
        return V;
    }

    public void setV(Double V)
    {
        this.V = V;
    }
    @Override
    public String toString()
    {
        return Double.toString(V);
    }
}
