// Step 6: Driver code to test all classes
public class Main {
    public static void main(String[] args) {
        // Create instances of Vehicle, Car, and F1
        Vehicle vehicle = new Vehicle("Generic Vehicle", 4);
        Car car = new Car("Sedan", 5);
        F1 f1 = new F1("Formula 1", 2);
        
        // Create an instance of Boat
        Boat boat = new Boat("Speedboat", 6);

        // Testing the Vehicle class
        System.out.println("Vehicle Name: " + vehicle.getVehicleName() + ", Capacity: " + vehicle.getVehicleCapacity());
        
        // Testing the Car class
        System.out.println("Car Name: " + car.getVehicleName() + ", Capacity: " + car.getVehicleCapacity());
        
        // Testing the F1 class
        System.out.println("F1 Name: " + f1.getVehicleName() + ", Capacity: " + f1.getVehicleCapacity());
        
        // Testing the Boat class
        System.out.println("Boat Name: " + boat.getVehicleName() + ", Capacity: " + boat.getVehicleCapacity());
    }
}
