package chapter11;

import java.util.*;

public class Person {
    String name;
    ArrayList friends;

    // add a field to store a birthday
    Date birthday;

    // write a method to set the birthday
    void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    // write a method to get the birthday
    Date getBirthday() {
        return birthday;
    }

}
