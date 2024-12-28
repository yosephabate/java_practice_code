package chapter13;

public class Airplane implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I fly in the sky!");
    }

    @Override
    public void description() {
        System.out.println("I am an airplane!");
    }
}
