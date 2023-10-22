package org.example;

import org.example.cars.abstractCars.Cars;
import org.example.cars.carModels.FogLights;
import org.example.maintenances.AbstractMaintenance.CheckMaintenanceForCar;
import org.example.maintenances.AbstractMaintenance.CreateMaintenanceList;
import org.example.refulingStation.abstractFueling.CeckFuelOnStation;
import org.example.refulingStation.abstractFueling.RefulingStation;
import java.util.ArrayList;

public class StartProgram
{
    public void strartProgram(ArrayList<Cars> listCars)
    {
        /** идём по списку автомобилей **/
        for (Cars car : listCars)
        {
            try
            {
                /** проверяем условия наличия на заправке нужного топлива и
                 * в случае его наличия заправлчяем автомобиль тем топливом, который
                 * подходит для данного типа автомобиля **/

                RefulingStation refulingStation = new RefulingStation();
                CeckFuelOnStation ceckFuelOnStation = new CeckFuelOnStation();
                ceckFuelOnStation.checkFuelOnStation(refulingStation.addFuelToList(), car);
                System.out.println("\n");

                CheckMaintenanceForCar checkMaintenanceForCar = new CheckMaintenanceForCar();
                CreateMaintenanceList createMaintenanceList = new CreateMaintenanceList();
                checkMaintenanceForCar.getCheckClassMaintenanceAndCar(createMaintenanceList.addMaintenanceToList(), car);
                System.out.println("\n");

                car.movementCar(car);
                System.out.println("\n");

                car.gearShifting(car);
                System.out.println("\n");

            }
            /*** отправляем автомобили на подходящюю для каждого типа автомобилей станцию
             * тех обслуживания **/

            /** кидаем исключение если такого топлива нет ни на одноё из заправок **/
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage() + "\n");
            }
        }
    }
}
