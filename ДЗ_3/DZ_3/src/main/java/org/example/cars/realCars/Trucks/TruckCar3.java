package org.example.cars.realCars.Trucks;

import org.example.cars.abstractCars.TruckCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class TruckCar3 extends TruckCars
{
    public TruckCars createCar()
    {
        TruckCar3 truckCar3 = new TruckCar3();
        truckCar3.setMake(Makes.Mersedes);
        truckCar3.setModel(Models.SuperTruck);
        truckCar3.setType(CarType.Truck);
        truckCar3.setColor(Color.Red);
        truckCar3.setEngineCapacity(new EngineCapacity(6.0));
        truckCar3.setFuelType(FuelType.Diesel);
        return truckCar3;
    }
}
