package org.example.maintenances.AbstractMaintenance;

import org.example.cars.abstractCars.Cars;
import org.example.cars.typeCars.CarType;

import java.util.ArrayList;


public class CheckMaintenanceForCar
{
    public void getCheckClassMaintenanceAndCar(ArrayList<Maintenance> listOfMaintenance, Cars car)
    {
        for(Maintenance maintenance : listOfMaintenance)
        {
                        if (maintenance.getTypeOfMaintenance().equals(car.getType()))
                        {
                            car.sendOnMaintenance(car, maintenance);
                        }
        }

    }
}

