package org.example.maintenances.AbstractMaintenance;

import org.example.cars.typeCars.CarType;

public class Maintenance
{
    private CarType typeOfMaintenance;


    public Maintenance(CarType typeOfMaintenance)
    {
        this.typeOfMaintenance = typeOfMaintenance;
    }


    public CarType getTypeOfMaintenance()
    {
        return typeOfMaintenance;
    }

    public void setTypeOfMaintenance(CarType typeOfMaintenance)
    {
        this.typeOfMaintenance = typeOfMaintenance;
    }
    public TypeOfMaintenance getPassanger()
    {
        return TypeOfMaintenance.Passanger;
    }
    public TypeOfMaintenance getTruck()
    {
        return TypeOfMaintenance.Truck;
    }
    public TypeOfMaintenance getBuss()
    {
        return TypeOfMaintenance.Bus;
    }

    public String toString()
    {
        return "Maintenance";
    }
}
