package com.driver;

public class Vehicle {

    String name;
    int capacity;

    public Vehicle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}
