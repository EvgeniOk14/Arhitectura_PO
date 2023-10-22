package org.example.cars.realCars.Trucks;

import org.example.cars.abstractCars.TruckCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class TruckCar1 extends TruckCars
{
    public TruckCars createCar()
    {
        TruckCar1 truckCar1 = new TruckCar1();
        truckCar1.setMake(Makes.Volvo);
        truckCar1.setModel(Models.RFTruck);
        truckCar1.setType(CarType.Truck);
        truckCar1.setColor(Color.Gray);
        truckCar1.setEngineCapacity(new EngineCapacity(5.5));
        truckCar1.setFuelType(FuelType.Diesel);
        return truckCar1;
    }
}
