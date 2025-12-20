package com.driver;

public class F1 implements Vehicle {

    private String name;
    private int capacity;

    public F1(String name, int capacity) {
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

