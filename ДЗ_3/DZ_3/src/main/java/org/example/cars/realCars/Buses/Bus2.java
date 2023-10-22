package org.example.cars.realCars.Buses;

import org.example.cars.abstractCars.Buses;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class Bus2 extends Buses
{
    public Buses createCar()
    {
        Bus2 bus2 = new Bus2();
        bus2.setMake(Makes.Volvo);
        bus2.setModel(Models.SuperBus);
        bus2.setType(CarType.Bus);
        bus2.setColor(Color.Red);
        bus2.setEngineCapacity(new EngineCapacity(3.5));
        bus2.setFuelType(FuelType.Gass);
        return bus2;
    }
}
