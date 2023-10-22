package org.example.cars.realCars.Passangers;

import org.example.cars.abstractCars.PassangerCars;
import org.example.cars.carModels.Color;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class PassangerCar4 extends PassangerCars
{
    public PassangerCars createCar()
    {
        PassangerCar4 passangerCar4 = new PassangerCar4();
        passangerCar4.setMake(Makes.Lexus);
        passangerCar4.setModel(Models.RXH450);
        passangerCar4.setType(CarType.Passanger);
        passangerCar4.setColor(Color.White);
        passangerCar4.setEngineCapacity(new EngineCapacity(3.5));
        passangerCar4.setFuelType(FuelType.Gasoline);
        return passangerCar4;
    }
}
