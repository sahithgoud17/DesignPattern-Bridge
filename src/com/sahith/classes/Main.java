package com.sahith.classes;

public class Main
{
    public static void main(String[] args)
    {
       Vehicle vehicle1 = new Car(new Wash() , new EngineRepair() );
       vehicle1.manufacture();

        System.out.println();

       Vehicle vehicle2 = new Bike(new Wash() , new EngineRepair() );
       vehicle2.manufacture();
    }
}
