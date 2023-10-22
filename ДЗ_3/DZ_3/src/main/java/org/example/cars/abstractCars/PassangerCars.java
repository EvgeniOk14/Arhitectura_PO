package org.example.cars.abstractCars;

import org.example.cars.carModels.*;
import org.example.cars.typeCars.CarType;
import org.example.refulingStation.abstractFueling.FuelType;

public class PassangerCars extends Cars
{
        private FuelType fuelType = FuelType.Gasoline;
        private FogLights fogLights = FogLights.Present;
        private GearboxType gearboxType = GearboxType.AT;
        private WheelsCount wheelsCount = WheelsCount.Four;

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public FogLights getFogLights() {
        return fogLights;
    }

    @Override
    public void setFogLights(FogLights fogLights) {
        this.fogLights = fogLights;
    }



        public FogLights getForgLitghs()
        {
            return FogLights.Present;
        }
        public void setForgLights()
        {
            this.fogLights = FogLights.Present;
        }
        public GearboxType getGearboxType()
        {
                return GearboxType.AT;
        }

        public void setGearboxType(GearboxType gearboxType)
        {
                this.gearboxType = GearboxType.AT;
        }

        public WheelsCount getWheelsCount()
        {
                return WheelsCount.Four;
        }

        public void setWheelsCount(WheelsCount wheelsCount)
        {
                this.wheelsCount = WheelsCount.Four;
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
}


//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType,
//                             GearboxType gearboxType, EngineCapacity engineCapacity,
//                             FogLights fogLights, FuelType fuelType1, FogLights fogLights1,
//                             GearboxType gearboxType1, WheelsCount wheelsCount1)
//        {
//                super(make, model, color, type, wheelsCount, fuelType, gearboxType, engineCapacity, fogLights);
//                this.fuelType = FuelType.Gasoline;
//                this.fogLights = FogLights.Present;
//                this.gearboxType = GearboxType.AT;
//                this.wheelsCount = WheelsCount.Four;
//        }
//
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType,
//                             GearboxType gearboxType, EngineCapacity engineCapacity,
//                             FogLights fogLights, FuelType fuelType1, FogLights fogLights1,
//                             GearboxType gearboxType1)
//        {
//                this(make,
//                        model,
//                        color,
//                        type,
//                        wheelsCount,
//                        fuelType,
//                        gearboxType,
//                        engineCapacity,
//                        fogLights,
//                        FuelType.Gasoline,
//                        FogLights.Present,
//                        GearboxType.AT,
//                null);
//        }
//
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType,
//                             GearboxType gearboxType, EngineCapacity engineCapacity,
//                             FogLights fogLights, FuelType fuelType1, FogLights fogLights1)
//        {
//                this(make,
//                        model,
//                        color,
//                        type,
//                        wheelsCount,
//                        fuelType,
//                        gearboxType,
//                        engineCapacity,
//                        fogLights,
//                        FuelType.Gasoline,
//                        FogLights.Present,
//                        null,
//                        null);
//        }
//
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType,
//                             GearboxType gearboxType, EngineCapacity engineCapacity,
//                             FogLights fogLights, FuelType fuelType1)
//        {
//                this(make,
//                        model,
//                        color,
//                        type,
//                        wheelsCount,
//                        fuelType,
//                        gearboxType,
//                        engineCapacity,
//                        fogLights,
//                        FuelType.Gasoline,
//                        null,
//                        null,
//                        null);
//        }
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType,
//                             GearboxType gearboxType, EngineCapacity engineCapacity,
//                             FogLights fogLights)
//        {
//                this(make,
//                        model,
//                        color,
//                        type,
//                        wheelsCount,
//                        fuelType,
//                        gearboxType,
//                        engineCapacity,
//                        fogLights,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType,
//                             GearboxType gearboxType, EngineCapacity engineCapacity)
//        {
//                this(make,
//                        model,
//                        color,
//                        type,
//                        wheelsCount,
//                        fuelType,
//                        gearboxType,
//                        engineCapacity,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType,
//                             GearboxType gearboxType)
//        {
//                this(make,
//                        model,
//                        color,
//                        type,
//                        wheelsCount,
//                        fuelType,
//                        gearboxType,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount, FuelType fuelType)
//        {
//                this(make,
//                        model,
//                        color,
//                        type,
//                        wheelsCount,
//                        fuelType,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//        public PassangerCars(Makes make, Models model, Color color,
//                             CarType type, WheelsCount wheelsCount)
//        {
//                this(make, model, color, type, wheelsCount,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//
//        public PassangerCars(Makes make, Models model, Color color, CarType type)
//        {
//                this(make, model, color, type, null, null, null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//
//        public PassangerCars(Makes make, Models model, Color color)
//        {
//                this(make, model, color, null, null, null, null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//        public PassangerCars(Makes make, Models model)
//        {
//                this(make, model, null, null, null, null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//
//        public PassangerCars(Makes make)
//        {
//                this(make, null, null, null, null, null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//        public PassangerCars()
//        {
//                this(null, null, null, null, null, null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null,
//                        null);
//        }
//
//        public FuelType getFuelType() {
//                return fuelType;
//        }
//
//        public void setFuelType(FuelType fuelType) {
//                this.fuelType = fuelType;
//        }
//
//        public FogLights getFogLights() {
//                return fogLights;
//        }
//
//        public void setFogLights(FogLights fogLights) {
//                this.fogLights = fogLights;
//        }