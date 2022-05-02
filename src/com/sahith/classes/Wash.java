package com.sahith.classes;

import com.sahith.interfaces.VehicleService;

public class Wash implements VehicleService
{

    @Override
    public void myVehicleService()
    {
        System.out.println("Vehicle has been successfully washed");
    }
}
