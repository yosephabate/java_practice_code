package lab050607;

import java.util.ArrayList;
import java.util.Iterator;

public class GradebookOO {
//    private double[] grades;
    private ArrayList<Double> grades;

    public GradebookOO() {
        //grades = new double[0];
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
//        double[] temp = new double[grades.length + 1];
//        for (int i = 0; i < grades.length; i++) {
//            temp[i] = grades[i];
//        }
//        temp[grades.length] = grade;
//        grades = temp;

        grades.add(grade);
    }

    public void deleteGrade(double grade) {
//        int index = -1;
//
//        for (int i = 0; i < grades.length; i++) {
//            if (grades[i] == grade) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index == -1) {
//            System.out.println("No such grade");
//            return;
//        }
//
//        double[] temp = new double[grades.length - 1];
//        for (int i = 0, j = 0; i < grades.length; i++) {
//            if (i != index) {
//                temp[j] = grades[i];
//                j++;
//            }
//        }
//
//        grades = temp;

        grades.remove(grade);
    }

    public void printGrades() {
        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("grades[%d]: %.2f\n", i, grades.get(i));
        }
    }

    public double averageGrade() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void letterGrade() {
        double average = this.averageGrade();
        if (average >= 90.0) {
            System.out.println("You got A!");
        } else if (average >= 80.0) {
            System.out.println("You got B!");
        } else if (average >= 70.0) {
            System.out.println("You got C!");
        } else if (average >= 60.0) {
            System.out.println("You got D!");
        } else {
            System.out.println("You got F!");
        }
    }
}
