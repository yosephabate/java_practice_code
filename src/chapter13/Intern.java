package chapter13;

public class Intern extends Student implements Employee {
    private double income;

    public Intern(String name, String course) {
        super(name, course);
        income = STARTING_SALARY;
    }

    @Override
    public double getSalary() {
        return income;
    }

    public String description() {
        return String.format("An intern majoring in %s with an income of %.2f", getCourse(), getSalary());
    }
}
