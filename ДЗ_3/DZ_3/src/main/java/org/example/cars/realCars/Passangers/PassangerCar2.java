package org.example.cars.realCars.Passangers;

import org.example.cars.abstractCars.PassangerCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class PassangerCar2 extends PassangerCars
{
    public PassangerCars createCar()
    {
        PassangerCar2 passangerCar2 = new PassangerCar2();
        passangerCar2.setMake(Makes.BMW);
        passangerCar2.setModel(Models.X5);
        passangerCar2.setType(CarType.Passanger);
        passangerCar2.setColor(Color.Gray);
        passangerCar2.setEngineCapacity(new EngineCapacity(3.0));
        passangerCar2.setFuelType(FuelType.Gasoline);
        return passangerCar2;
    }
}
