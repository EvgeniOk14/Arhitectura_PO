package org.example.cars.realCars.Buses;

import org.example.cars.abstractCars.Buses;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class Bus3 extends Buses
{
    public Buses createCar()
    {
        Bus3 bus3 = new Bus3();
        bus3.setMake(Makes.Mersedes);
        bus3.setModel(Models.TravelBus);
        bus3.setType(CarType.Bus);
        bus3.setColor(Color.Black);
        bus3.setEngineCapacity(new EngineCapacity(4.0));
        bus3.setFuelType(FuelType.Gass);
        return bus3;
    }
}
