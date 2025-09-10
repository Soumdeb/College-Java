// 8. Use final to Prevent Overriding
class Vehicle {
    final void start() {  
        System.out.println("Vehicle starts with a key.");
    }
}

class Car extends Vehicle {
    
    void drive() {
        System.out.println("Car is driving.");
    }
}

public class FinalOverrideDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  
        c.drive();
    }
}
