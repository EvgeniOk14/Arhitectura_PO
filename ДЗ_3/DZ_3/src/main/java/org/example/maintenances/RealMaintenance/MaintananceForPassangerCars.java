package org.example.maintenances.RealMaintenance;

import org.example.cars.typeCars.CarType;
import org.example.maintenances.AbstractMaintenance.Maintenance;


public class MaintananceForPassangerCars extends Maintenance
{
    public MaintananceForPassangerCars(CarType typeOfMaintenance)
    {
        super(typeOfMaintenance);
    }

    @Override
    public String toString()
    {
        return "MaintananceForPassangerCars";
    }
}
