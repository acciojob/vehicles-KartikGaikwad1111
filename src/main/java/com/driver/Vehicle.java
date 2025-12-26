// Step 1: Define the Vehicle class
class Vehicle {
    String name; // The name of the vehicle
    int capacity; // The capacity of the vehicle

    // Constructor
    public Vehicle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Method to get the name of the vehicle
    public String getVehicleName() {
        return name;
    }

    // Method to get the capacity of the vehicle
    public int getVehicleCapacity() {
        return capacity;
    }
}
// Step 2: Define the Car class that extends Vehicle
