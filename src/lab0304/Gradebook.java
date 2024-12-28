package lab0304;

public class Gradebook {
    public static void printGrades(double[] grades) {
        // Print all grades
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("grades[%d]: %.2f\n", i, grades[i]);
        }
    }

    public static double averageGrade(double[] grades) {
        // Sum all grades
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        // Calculate the average
        double average = sum / grades.length;
        return average;
    }

    public static String letterGrade(double average) {
        // Calculate letter grade
        String message = "";
        if (average >= 90)
            message = "You got A.";
        else if (average >= 80)
            message = "You got B.";
        else if (average >= 70)
            message = "You got C.";
        else if (average >= 60)
            message = "You got D.";
        else
            message = "You got F.";

        return message;
    }

    public static void main(String[] args) {
        double[] grades = {90, 34, 56, 87, 100, 23};

        printGrades(grades);

        double average = averageGrade(grades);
        System.out.printf("Your average grade is %.2f\n", average);

        String message = letterGrade(average);
        System.out.println(message);
    }
}
