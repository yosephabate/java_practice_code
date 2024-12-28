package students;

public class ResearchAssistant extends Grad implements Employee {
    private double salary;

    public ResearchAssistant(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getPay() {
        return salary;
    }

    public String description() {
        return String.format("%s %.2f", super.description(), getPay());
    }
}
