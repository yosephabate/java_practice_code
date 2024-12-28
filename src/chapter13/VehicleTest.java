package chapter13;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle airplane = new Airplane();

        car.drive();
        airplane.drive();

        car.description();
        airplane.description();

        Vehicle.commonMethod();
    }
}
