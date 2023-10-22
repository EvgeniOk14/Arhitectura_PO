package org.example.refulingStation.abstractFueling;

import org.example.cars.abstractCars.Cars;

import java.util.Map;
import java.util.Set;

public class CeckFuelOnStation
{
    public void checkFuelOnStation(Map<RefulingStation, Set<FuelType>> listRefuelstationAndFuel, Cars car)
    {
        /** Создаём флаг, пока не переберёт все заправки и не найдёт нужное топливо
         * программа будет искать при этом флаг поменяется на true **/
        boolean fuelFound = false;
        /** Проходим по всем записям в map
         * (каждая запись представляет собой заправочную станцию
         * и список доступных топлив)**/
        for (Map.Entry<RefulingStation, Set<FuelType>> entry : listRefuelstationAndFuel.entrySet())
        {
            /** Получаем объект заправочной станции **/
            RefulingStation refulingStation = entry.getKey();

            /** Получаем доступные виды топлива на станции и
             *  Проверяем, есть ли топливо для данного автомобиля на текущей станции**/
            Set<FuelType> availableFuelTypes = entry.getValue();

            /** Делаем проверку, если значения, т.е. список топлива содержит топливо
             *  которое необходимо данному автомобилю
             *  если да, то заправляем автомобиль **/
            if (availableFuelTypes.contains(car.getFuelType()))
            {
                car.processfuel(car, refulingStation); // Вызываем метод обработки заправки для автомобиля
                fuelFound = true;
                break;
            }
            /** В случае отсутствия нужного топлива кидаем исключение **/
            if (fuelFound)
            {
                throw new IllegalArgumentException("На станции" + refulingStation + "нет необходимого топлива.");
            }
        }
    }

}
