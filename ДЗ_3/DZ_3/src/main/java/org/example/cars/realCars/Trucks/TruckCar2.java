package org.example.cars.realCars.Trucks;

import org.example.cars.abstractCars.TruckCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class TruckCar2 extends TruckCars
{
    public TruckCars createCar()
    {
        TruckCar2 truckCar2 = new TruckCar2();
        truckCar2.setMake(Makes.Scania);
        truckCar2.setModel(Models.XfTruck);
        truckCar2.setType(CarType.Truck);
        truckCar2.setColor(Color.Green);
        truckCar2.setEngineCapacity(new EngineCapacity(4.0));
        truckCar2.setFuelType(FuelType.Diesel);
        return truckCar2;
    }
}
