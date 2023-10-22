package org.example.cars.realCars.Passangers;

import org.example.cars.abstractCars.PassangerCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class PassangerCar5 extends PassangerCars
{
    public PassangerCars createCar()
    {
        PassangerCar5 passangerCar5 = new PassangerCar5();
        passangerCar5.setMake(Makes.Toyota);
        passangerCar5.setModel(Models.Camry);
        passangerCar5.setType(CarType.Passanger);
        passangerCar5.setColor(Color.White);
        passangerCar5.setEngineCapacity(new EngineCapacity(2.5));
        passangerCar5.setFuelType(FuelType.Gasoline);
        return passangerCar5;
    }
}
