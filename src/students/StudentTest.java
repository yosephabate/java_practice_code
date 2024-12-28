package students;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student u = new Undergrad("Abebe", 4);
        Student g = new Grad("Azalech");
        Student i = new Intern("Mulatu", 2, 20, 30);
        Student r = new ResearchAssistant("Halima", 20000);

        Student[] allStudents = {u, g, i, r};

        for (Student s : allStudents) {
            System.out.println(s.description());
        }

        Employee[] payeeStudents = {(Employee) i, (Employee) r};

        for (Employee s : payeeStudents) {
            System.out.println(s.getPay());
        }
    }
}
