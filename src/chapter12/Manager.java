package chapter12;

public class Manager extends Employee {
    private double salary;

    public Manager(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getPay() {
        return salary;
    }

    public void printData() {
        super.printData();
        System.out.println("Payment: " + getPay());
    }
}
