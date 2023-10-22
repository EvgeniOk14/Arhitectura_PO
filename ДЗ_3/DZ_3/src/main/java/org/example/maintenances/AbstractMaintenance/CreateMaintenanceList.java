package org.example.maintenances.AbstractMaintenance;

import org.example.cars.typeCars.CarType;
import org.example.maintenances.RealMaintenance.MaintananceForPassangerCars;
import org.example.maintenances.RealMaintenance.MaintenanceForBuses;
import org.example.maintenances.RealMaintenance.MaintenanceForTrucks;

import java.util.ArrayList;

public class CreateMaintenanceList
{
    public ArrayList<Maintenance> addMaintenanceToList()
    {
        /** Создаём лист станций тех обслуживания **/
        ArrayList<Maintenance> listOfMaintenance = new ArrayList<>();

        MaintananceForPassangerCars Passanger = new MaintananceForPassangerCars(CarType.Passanger);
        MaintenanceForTrucks Truck = new MaintenanceForTrucks(CarType.Truck);
        MaintenanceForBuses Bus = new MaintenanceForBuses(CarType.Bus);


        listOfMaintenance.add(Passanger);
        listOfMaintenance.add(Truck);
        listOfMaintenance.add(Bus);

        return listOfMaintenance;
    }
}
