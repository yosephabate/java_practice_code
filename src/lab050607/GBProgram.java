package lab050607;

import java.util.Scanner;

public class GBProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many grades? ");
        int size = sc.nextInt();
        double[] grades = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("grades[%d]: ", i);
            double grade = sc.nextDouble();
            grades[i] = grade;
        }

        GradebookOO gb = new GradebookOO();
        for (double grade : grades) {
            gb.addGrade(grade);
        }

        gb.printGrades();
        System.out.printf("Your average grade is %.2f\n", gb.averageGrade());
        gb.letterGrade();

        System.out.print("Grade to delete: ");
        double grade = sc.nextDouble();
        gb.deleteGrade(grade);

        gb.printGrades();
        System.out.printf("Your average grade is %.2f\n", gb.averageGrade());
        gb.letterGrade();
    }
}
