package chapter13;

public class TestClass {
    public static void main(String[] args) {
        Intern a = new Intern("Conor", "Math");
        Student b = new Intern("Conor", "Math");
        Employee c = new Intern("Conor", "Math");

        System.out.println(a.getSalary());

        System.out.println(((Intern)b).getSalary());
        System.out.println(((Employee) b).getSalary());
        System.out.println(c.getSalary());

        System.out.println(b.getCourse());
        System.out.println(((Intern)c).getCourse());
        System.out.println(((Student)c).getCourse());
    }
}
