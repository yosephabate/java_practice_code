package chapter12;

public class Engineer extends Employee{
    private double wage;
    private double hoursWorked;

    public Engineer(String firstName, String lastName, double wage, double hoursWorked) {
        super(firstName, lastName);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getPay() {
        return wage * hoursWorked;
    }

    public void printData() {
        super.printData();
        System.out.println("Payment: " + getPay());
    }
}
