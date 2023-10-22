package org.example.cars.realCars.Passangers;

import org.example.cars.abstractCars.PassangerCars;
import org.example.cars.carModels.EngineCapacity;
import org.example.cars.carModels.Makes;
import org.example.cars.carModels.Models;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;
import static org.example.cars.carModels.Color.Black;


public class PassangerCar1 extends PassangerCars
{
    public PassangerCars createCar()
    {
        PassangerCar1 passangerCar1 = new PassangerCar1();
        passangerCar1.setMake(Makes.Mersedes);
        passangerCar1.setModel(Models.S500);
        passangerCar1.setType(CarType.Passanger);
        passangerCar1.setColor(Black);
        passangerCar1.setEngineCapacity(new EngineCapacity(5.0));
        passangerCar1.setFuelType(FuelType.Gasoline);
        return passangerCar1;
    }
}


