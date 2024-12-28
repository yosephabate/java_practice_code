package students;

public class Intern extends Undergrad implements Employee {
    private double wage;
    private int hours;

    public Intern(String name, int year, double wage, int hours) {
        super(name, year);
        this.wage = wage;
        this.hours = hours;
    }

    public double getPay() {
        return wage * hours;
    }

    public String description() {
        return String.format("%s %.2f", super.description(), getPay());
    }
}
