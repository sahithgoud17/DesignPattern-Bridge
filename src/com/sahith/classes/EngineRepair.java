package com.sahith.classes;

import com.sahith.interfaces.VehicleService;

public class EngineRepair implements VehicleService
{


    @Override
    public void myVehicleService()
    {
        System.out.println("My Vehicle has been successfully repaired");
    }
}
