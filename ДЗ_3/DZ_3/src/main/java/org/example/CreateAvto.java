package org.example;

import org.example.cars.abstractCars.Cars;
import org.example.cars.realCars.Buses.Bus1;
import org.example.cars.realCars.Buses.Bus2;
import org.example.cars.realCars.Buses.Bus3;
import org.example.cars.realCars.Passangers.*;
import org.example.cars.realCars.Trucks.TruckCar1;
import org.example.cars.realCars.Trucks.TruckCar2;
import org.example.cars.realCars.Trucks.TruckCar3;

import java.util.ArrayList;


public class CreateAvto
{
    public  ArrayList<Cars>  createAvto()
    {
        /** Создание списка автомобилей **/
        ArrayList<Cars> listCars = new ArrayList<>();

        /** Создание первого легковых автомобилей **/
        PassangerCar1 passangerCar1 = new PassangerCar1();
        PassangerCar2 passangerCar2 = new PassangerCar2();
        PassangerCar3 passangerCar3 = new PassangerCar3();
        PassangerCar4 passangerCar4 = new PassangerCar4();
        PassangerCar5 passangerCar5 = new PassangerCar5();

        TruckCar1 truckCar1 = new TruckCar1();
        TruckCar2 truckCar2 = new TruckCar2();
        TruckCar3 truckCar3 = new TruckCar3();

        Bus1 bus1 = new Bus1();
        Bus2 bus2 = new Bus2();
        Bus3 bus3 = new Bus3();

        /** добавление созжанных автомобилей в список автомобилей**/
        listCars.add(passangerCar1.createCar());
        listCars.add(passangerCar2.createCar());
        listCars.add(passangerCar3.createCar());
        listCars.add(passangerCar4.createCar());
        listCars.add(passangerCar5.createCar());
        listCars.add(truckCar1.createCar());
        listCars.add(truckCar2.createCar());
        listCars.add(truckCar3.createCar());
        listCars.add(bus1.createCar());
        listCars.add(bus2.createCar());
        listCars.add(bus3.createCar());

        /** Возвращаем список автомобилей **/
        return listCars;
    }
}
