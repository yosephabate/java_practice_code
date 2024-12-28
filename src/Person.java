class Person {
    String name = "Jamal";
    int age = 26;

    Person() {}

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

    int getAge() {
        return age;
    }

    void setAge(int a) {
        age = a;
    }

    boolean smellsBad() {
        return false;
    }
}

class TestPerson {
    public static void main(String[] args) {
        // Create a Person with name=George and age=22
        Person george = new Person();
        george.setName("George");
        george.setAge(22);

        System.out.println(george.name + " " + george.age);

        // Create another Person with name=George and age=22
        Person p = new Person();
        p.setName("George");
        p.setAge(22);
    }
}