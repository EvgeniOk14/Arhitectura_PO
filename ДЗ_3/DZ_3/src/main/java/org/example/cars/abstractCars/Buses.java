package org.example.cars.abstractCars;

import org.example.cars.carModels.FogLights;
import org.example.cars.carModels.GearboxType;
import org.example.cars.carModels.WheelsCount;
import org.example.refulingStation.abstractFueling.FuelType;

public class Buses extends Cars
{
    private FuelType fuelType = FuelType.Gass;

    private FogLights fogLights = FogLights.Absent;

    private  GearboxType gearboxType = GearboxType.MT;
    private  WheelsCount wheelsCount = WheelsCount.Six;

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Тип топлива: ").append(fuelType).append("\n");
        sb.append("Тип коробки передач: ").append(gearboxType).append("\n");
        sb.append("Число колес: ").append(wheelsCount).append("\n");
        sb.append("Состояние противотуманных фар: ").append(fogLights).append("\n");
        sb.append("Объём двигителя: ").append(engineCapacity).append("\n");
        return sb.toString();
    }
    @Override
    public void movementCar(Cars car)
    {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Машина марки: ").append(car.getMake()).append("\n")
                .append("модель: ").append(car.getModel());
        System.out.println(sb1.toString());
        System.out.println("Находиться в движении! ");
    }

    @Override
    public void gearShifting(Cars car)
    {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Машина марки: ").append(car.getMake()).append("\n")
                .append("модель: ").append(car.getModel());
        System.out.println(sb1.toString());
        System.out.println("Переключил скорость! ");
    }

    @Override
    public void switchForglights(Cars car)
    {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Машина марки: ").append(car.getMake()).append("\n")
                .append("модель: ").append(car.getModel());
        System.out.println(sb1.toString());
        System.out.println("Включил противотуманные фары! ");
    }
}
