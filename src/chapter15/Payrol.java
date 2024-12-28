package chapter15;

import java.io.*;
import java.util.StringTokenizer;

public class Payrol {
    public static void calculatePayrol(
            String source_emp_file,
            String hours_file,
            String destination_emp_file) {

        try (
                BufferedReader br_source = new BufferedReader(new FileReader(source_emp_file));
                BufferedReader br_hours = new BufferedReader(new FileReader(hours_file));
                BufferedWriter bw_destination = new BufferedWriter(new FileWriter(destination_emp_file))
                ) {

            String hours = br_hours.readLine();
            StringTokenizer stHours = new StringTokenizer(hours);

            String emp = br_source.readLine();
            while (emp != null) {
                StringTokenizer stEmp = new StringTokenizer(emp, ",");
                while (stEmp.hasMoreTokens()) {
                    String name = stEmp.nextToken().trim();
                    String ssn = stEmp.nextToken().trim();
                    int wage = Integer.parseInt(stEmp.nextToken().trim());
                    int salary = Integer.parseInt(stEmp.nextToken().trim());

                    salary += wage * Integer.parseInt(stHours.nextToken());

                    bw_destination.write(name + ", " + ssn + ", " + wage + ", " + salary);
                    bw_destination.newLine();
                }
                emp = br_source.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File I/O exception!");
        }
    }

    public static void main(String[] args) {
        calculatePayrol(
                "/Users/yosephabate/Employee_May.dat",
                "/Users/yosephabate/Hours_June.dat",
                "/Users/yosephabate/Employe_June.dat"
        );
    }
}
