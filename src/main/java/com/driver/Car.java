package com.driver;

public class Car implements Vehicle {

    private String name;
    private int capacity;

    public Car(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}

