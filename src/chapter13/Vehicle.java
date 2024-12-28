package chapter13;

interface Vehicle {
    void drive();

    default void description() {
        System.out.println("Vehicle description");
    }

    static void commonMethod() {
        System.out.println("Vehicle common method");
    }
}
