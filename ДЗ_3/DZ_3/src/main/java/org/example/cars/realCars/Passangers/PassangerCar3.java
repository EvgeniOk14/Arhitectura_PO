package org.example.cars.realCars.Passangers;

import org.example.cars.abstractCars.PassangerCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class PassangerCar3 extends PassangerCars
{
    public PassangerCars createCar()
    {
        PassangerCar3 passangerCar3 = new PassangerCar3();
        passangerCar3.setMake(Makes.Audi);
        passangerCar3.setModel(Models.A8);
        passangerCar3.setType(CarType.Passanger);
        passangerCar3.setColor(Color.Green);
        passangerCar3.setEngineCapacity(new EngineCapacity(4.0));
        passangerCar3.setFuelType(FuelType.Gasoline);
        return passangerCar3;
    }
}
