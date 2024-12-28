package students;

public abstract class Student {
    private String name;
    private int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public abstract String description();
}
