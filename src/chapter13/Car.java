package chapter13;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I roll on the road!");
    }

    @Override
    public void description() {
        System.out.println("Car description");
    }
}
