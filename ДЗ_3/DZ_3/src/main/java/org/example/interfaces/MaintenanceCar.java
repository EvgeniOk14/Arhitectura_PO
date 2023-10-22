package org.example.interfaces;

import org.example.cars.abstractCars.Cars;
import org.example.maintenances.AbstractMaintenance.Maintenance;

public interface MaintenanceCar
{
    public void sendOnMaintenance(Cars car, Maintenance maintenance);
}
