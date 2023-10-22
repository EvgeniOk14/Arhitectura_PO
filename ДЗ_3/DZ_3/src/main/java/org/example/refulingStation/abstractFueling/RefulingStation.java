package org.example.refulingStation.abstractFueling;

import org.example.cars.abstractCars.Cars;
import org.example.refulingStation.RealRefuelStations.RefulingStation1;
import org.example.refulingStation.RealRefuelStations.RefulingStation2;
import org.example.refulingStation.RealRefuelStations.RefulingStation3;
import java.util.*;

public  class RefulingStation
{

    public Map<RefulingStation, Set<FuelType>> addFuelToList()
    {
        /** Создаём экземпляры типов заправочных станций**/
        RefulingStation refulingStation1 = new RefulingStation1();
        RefulingStation refulingStation2 = new RefulingStation2();
        RefulingStation refulingStation3 = new RefulingStation3();


        /** Создаём список доступного топлива на первой заправке и
         *  добавляем в него доступное топливо,
         *  которое есть в наличии на данной заправке **/
        Set<FuelType> availableFuelListRefuelStation1 = new HashSet<>();
        availableFuelListRefuelStation1.add(FuelType.Gasoline);
        availableFuelListRefuelStation1.add(FuelType.Diesel);

        /** Создаём список доступного топлива на второй заправке и
         *  добавляем в него доступное топливо,
         *  которое есть в наличии на данной заправке **/
        Set<FuelType> availableFuelListRefuelStation2 = new HashSet<>();
        availableFuelListRefuelStation2.add(FuelType.Diesel);
        availableFuelListRefuelStation2.add(FuelType.Gasoline);

        /** Создаём список доступного топлива на третьей заправке и
         *  добавляем в него доступное топливо,
         *  которое есть в наличии на данной заправке **/
        Set<FuelType> availableFuelListRefuelStation3 = new HashSet<>();
        availableFuelListRefuelStation3.add(FuelType.Gass);
        availableFuelListRefuelStation3.add(FuelType.Diesel);

        /** Создаём список из ключей - заправочные станции и
         * их значений - список топлива на этих станциях **/
        Map<RefulingStation, Set<FuelType>> listRefuelstationAndFuel =new HashMap<RefulingStation, Set<FuelType>>();

        /** Добавляем в список из ключей и значений:
         * ключи - это заправочные станции
         * значения - это список с видами топлива, находящиеся в наличии
         * на данной заправочной станции **/
        listRefuelstationAndFuel.put(refulingStation1, availableFuelListRefuelStation1);
        listRefuelstationAndFuel.put(refulingStation2, availableFuelListRefuelStation2);
        listRefuelstationAndFuel.put(refulingStation3, availableFuelListRefuelStation3);

        /** Возвращаем список заправок и топлива на них**/
        return listRefuelstationAndFuel;
    }

    @Override
    public String toString()
    {
        return "RefulingStation";
    }
}
