/*
write a java program to create three classes Vehicle, Car and Truck. Car
and Truck is inherited from vehicle class. Write a method “show” in all three
classes to display the vehicle, car and Trucks details. Write suitable
constructors and use super() and super wherever necessary. Use atleast 2
instance variables in every class. Also, include a method in car class to list out
all the cars which give mileage>23
 */
// Thu June 13 2024



class Vehicle {
    String vehicle_name;
    String vehicle_number;
    Vehicle(String vehicle_name, String vehicle_number) {
        this.vehicle_name = vehicle_name;
        this.vehicle_number = vehicle_number;
    }
    void show() {
        System.out.println("Vehicle name : " + vehicle_name);
        System.out.println("Vehicle number : " + vehicle_number);
    }
}


class Car extends Vehicle {
    int mileage;
    
    Car(String vehicle_name, String vehicle_number, int mileage) {
        super(vehicle_name, vehicle_number);
        this.mileage = mileage;
    }
    
    @Override
    void show() {
        super.show();
        System.out.println("Mileage: " + mileage);
    }
    
    boolean hasHighMileage() {
        return mileage > 23;
    }
}

class Truck extends Vehicle {
    
    Truck(String vehicle_name, String vehicle_number) {
        super(vehicle_name, vehicle_number);
    }
    
    @Override
    void show() {
        super.show();
    }
}


public class vehicle_methods_using_constructors {
    public static void main(String[] args) {

        System.out.println("Question 2 output : ");
        System.out.println();

        Car car1 = new Car("Car 1", "5678", 25);
        Car car2 = new Car("Car 2", "1027", 20);
        Truck truck1 = new Truck("Truck 1", "91011");
        
        System.out.println("Details of Car 1:");
        car1.show();
        System.out.println();
        
        System.out.println("Details of Car 2:");
        car2.show();
        System.out.println();
        
        System.out.println("Details of Truck 1:");
        truck1.show();
        System.out.println();
        
        System.out.println("Cars with mileage > 23:");
        if (car1.hasHighMileage()) {
            car1.show();
            System.out.println();
        }
        if (car2.hasHighMileage()) {
            car2.show();
            System.out.println();
        }
    }
}





