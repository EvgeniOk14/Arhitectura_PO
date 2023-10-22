package org.example.cars.abstractCars;

import org.example.cars.carModels.*;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class TruckCars extends Cars
{
    private FuelType fuelType = FuelType.Diesel;

    private FogLights fogLights = FogLights.Present;
    private GearboxType gearboxType = GearboxType.AT;
    private WheelsCount wheelsCount = WheelsCount.Ten;

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = FuelType.Diesel;
    }

    @Override
    public FogLights getFogLights() {
        return FogLights.Present;
    }

    @Override
    public void setFogLights(FogLights fogLights) {
        this.fogLights = FogLights.Present;
    }

    @Override
    public GearboxType getGearboxType() {
        return GearboxType.AT;
    }

    @Override
    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = GearboxType.AT;
    }

    @Override
    public WheelsCount getWheelsCount() {
        return WheelsCount.Ten;
    }

    @Override
    public void setWheelsCount(WheelsCount wheelsCount) {
        this.wheelsCount = WheelsCount.Ten;
    }


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
