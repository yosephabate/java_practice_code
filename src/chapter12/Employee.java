package chapter12;

class Employee extends Object {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printData() {
        System.out.println(firstName + " " + lastName);
    }
}
