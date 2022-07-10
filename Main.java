package com.company;

import com.company.details.Engine;
import com.company.entities.Person;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args){
        Car car = new Car();

        car.toString("BMW","X3",200000,"DDriver", "Engine");
        Lorry lorry = new Lorry();
        lorry.toString("Lorry","F810",1500000,"Driver","Engine 2x");
    }


}
