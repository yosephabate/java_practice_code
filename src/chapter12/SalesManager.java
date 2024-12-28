package chapter12;

public class SalesManager extends Manager{
    private double bonus;

    public SalesManager(String firstName, String lastName, double bonus) {
        super(firstName, lastName, 1250);
        this.bonus = bonus;
    }

    public double getPay() {
        return super.getPay() + bonus;
    }

    public void printData() {
        super.printData();
        //System.out.println("Payment: " + getPay());
    }
}
