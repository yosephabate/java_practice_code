package students;

public class Undergrad extends Student {
    public Undergrad(String name, int year) {
        super(name, year);
    }

    public String description() {
        return String.format("%s U %d", getName(), getYear());
    }
}
