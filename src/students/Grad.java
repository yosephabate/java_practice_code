package students;

public class Grad extends Student {
    public Grad(String name) {
        super(name, 5);
    }

    public String description() {
        return String.format("%s G", getName());
    }
}
