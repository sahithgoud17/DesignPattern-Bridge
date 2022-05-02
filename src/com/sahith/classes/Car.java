package com.sahith.classes;

import com.sahith.interfaces.VehicleService;

public class Car extends Vehicle
{
    public Car(VehicleService vehicleService1 , VehicleService vehicleService2)
    {
        super(vehicleService1 , vehicleService2);
    }

    @Override
    public void manufacture()
    {
        System.out.println("Car");
        vehicleService1.myVehicleService();
        vehicleService2.myVehicleService();
    }
}
