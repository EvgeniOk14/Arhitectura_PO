package org.example.maintenances.RealMaintenance;

import org.example.cars.typeCars.CarType;
import org.example.maintenances.AbstractMaintenance.Maintenance;

public class MaintenanceForBuses extends Maintenance
{
    public MaintenanceForBuses(CarType typeOfMaintenance)
    {
        super(typeOfMaintenance);
    }


    @Override
    public String toString()
    {
        return "MaintenanceForBuses";
    }
}
