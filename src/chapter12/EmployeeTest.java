package chapter12;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Abebe", "Zeleke");
        Employee emp2 = new Manager("Muluneh", "Lemma", 2000);
        Employee emp3 = new Engineer("Tessema", "Gobena", 24, 56);
        Employee emp4 = new SalesManager("Samantha", "Abichu", 2000);

        Employee[] employees = {emp1, emp2, emp3, emp4};
        for (Employee emp : employees) {
            emp.printData();
            System.out.println("=======================");
        }
    }
}
