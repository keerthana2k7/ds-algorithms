interface Vehicle {
    void start();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts");
    }    
}
public class Interface {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v = new Bike();
        v.start();
    }
}
