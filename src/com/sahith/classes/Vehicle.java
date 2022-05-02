package com.sahith.classes;

import com.sahith.interfaces.VehicleService;

public abstract class Vehicle
{
    VehicleService vehicleService1;
    VehicleService vehicleService2;

    public Vehicle(VehicleService vehicleService1 , VehicleService vehicleService2)
    {
        this.vehicleService1 = vehicleService1;
        this.vehicleService2 = vehicleService2;
    }

    abstract public void manufacture();
}
