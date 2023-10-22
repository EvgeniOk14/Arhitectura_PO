package org.example.cars.realCars.Buses;


import org.example.cars.abstractCars.Buses;
import org.example.cars.abstractCars.TruckCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.realCars.Trucks.TruckCar2;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class Bus1 extends Buses
{
    public Buses createCar()
    {
        Bus1 bus1 = new Bus1();
        bus1.setMake(Makes.Hyndai);
        bus1.setModel(Models.JetBus);
        bus1.setType(CarType.Bus);
        bus1.setColor(Color.Green);
        bus1.setEngineCapacity(new EngineCapacity(3.0));
        bus1.setFuelType(FuelType.Gass);
        return bus1;
    }
}