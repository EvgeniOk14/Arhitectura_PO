package org.example.cars.abstractCars;

import org.example.cars.carModels.*;
import org.example.cars.typeCars.CarType;
import org.example.interfaces.GearShift;
import org.example.interfaces.MaintenanceCar;
import org.example.interfaces.MoveCar;
import org.example.interfaces.SwitchLight;
import org.example.maintenances.AbstractMaintenance.Maintenance;
import org.example.refulingStation.abstractFueling.*;


public class Cars implements Refueling, GearShift, MoveCar, MaintenanceCar, SwitchLight
{
    public Makes make;

    // Модель
    public Models model;

    // Цвет
    public Color color;

    // Тип
    public CarType type;

    // Число колес
    public WheelsCount wheelsCount;

    // Тип топлива
    public FuelType fuelType;

    // Тип коробки передач
    public GearboxType gearboxType;

    // Объем двигателя
    public EngineCapacity engineCapacity;

    // Состояние противотуманных фар
    public FogLights fogLights;


    public Cars(Makes make, Models model, Color color, CarType type, WheelsCount wheelsCount, FuelType fuelType, GearboxType gearboxType, EngineCapacity engineCapacity, FogLights fogLights) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = type;
        this.wheelsCount = wheelsCount;
        this.fuelType = fuelType;
        this.gearboxType = gearboxType;
        this.engineCapacity = engineCapacity;
        this.fogLights = fogLights;
    }

    public Cars(Makes make, Models model, Color color, CarType type, WheelsCount wheelsCount, FuelType fuelType, GearboxType gearboxType, EngineCapacity engineCapacity)
    {
        this(make, model, color, type, wheelsCount, fuelType, gearboxType, engineCapacity, null);
    }

    public Cars(Makes make, Models model, Color color, CarType type, WheelsCount wheelsCount, FuelType fuelType, GearboxType gearboxType)
    {
        this(make, model, color, type, wheelsCount, fuelType, gearboxType, null, null);
    }

    public Cars(Makes make, Models model, Color color, CarType type, WheelsCount wheelsCount, FuelType fuelType)
    {
        this(make, model, color, type, wheelsCount, fuelType, null, null, null);
    }

    public Cars(Makes make, Models model, Color color, CarType type, WheelsCount wheelsCount)
    {
        this(make, model, color, type, wheelsCount, null, null, null, null);
    }

    public Cars(Makes make, Models model, Color color, CarType type)
    {
        this(make, model, color, type, null, null, null, null, null);
    }

    public Cars(Makes make, Models model, Color color)
    {
        this(make, model, color, null, null, null, null, null, null);
    }

    public Cars(Makes make, Models model)
    {
        this(make, model, null, null, null, null, null, null, null);
    }

    public Cars(Makes make)
    {
        this(make, null, null, null, null, null, null, null, null);
    }

    public Cars()
    {
        this(null, null, null, null, null, null, null, null, null);
    }

    public Makes getMake()
    {
        return make;
    }

    public void setMake(Makes make)
    {
        this.make = make;
    }

    public Models getModel()
    {
        return model;
    }

    public void setModel(Models model)
    {
        this.model = model;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public CarType getType()
    {
        return type;
    }

    public void setType(CarType type)
    {
        this.type = type;
    }

    public WheelsCount getWheelsCount()
    {
        return wheelsCount;
    }

    public void setWheelsCount(WheelsCount wheelsCount)
    {
        this.wheelsCount = wheelsCount;
    }

    public FuelType getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType)
    {
        this.fuelType = fuelType;
    }

    public GearboxType getGearboxType()
    {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType)
    {
        this.gearboxType = gearboxType;
    }

    public EngineCapacity getEngineCapacity()
    {
        return engineCapacity;
    }

    public void setEngineCapacity(EngineCapacity engineCapacity)
    {
        this.engineCapacity = engineCapacity;
    }

    public FogLights getFogLights()
    {
        return fogLights;
    }

    public void setFogLights(FogLights fogLights)
    {
        this.fogLights = fogLights;
    }



    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Модель: ").append(make).append("\n")
                .append("Марка: ").append(model).append("\n")
                .append("цвет: ").append(color).append("\n")
                .append("тип: ").append(type).append("\n");
        return sb.toString();
    }
    @Override
    public void processfuel(Cars car, RefulingStation refulingStation)
    {
        System.out.println(car);
        StringBuilder sb = new StringBuilder();
        sb.append("Машина марки: ").append(car.getMake()).append("\n")
                .append("модель: ").append(car.getModel());
        System.out.println(sb.toString());
        System.out.println("заправляеться топливом на заправочной станции " + refulingStation);
    }

    @Override
    public void sendOnMaintenance(Cars car, Maintenance maintenance)
    {

//        System.out.println(car.toString());
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Машина марки: ").append(car.getMake()).append("\n")
                .append("модель: ").append(car.getModel());
        System.out.println(sb1.toString());
        System.out.println("проходит техническое обслуживание на станции " + maintenance);

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
    public void movementCar(Cars car)
    {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Машина марки: ").append(car.getMake()).append("\n")
                .append("модель: ").append(car.getModel());
        System.out.println(sb1.toString());
        System.out.println("Находиться в движении! ");
    }
}
