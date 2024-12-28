package lab02;

public class UsingControlStructures {
    public static void main(String[] args) {
        int age = 17;
        if (age < 18) {
            System.out.println("You are too young to drive!");
        } else {
            System.out.println("You are old enough to drive!");
        }


//        for (int i = 100; i > 0; i--) {
//            if (i % 2 != 0) {
//                System.out.println("Odd: " + i);
//            }
//        }

        int i = 100;
        while (i > 0) {
            if (i%2 != 0) {
                System.out.println("Odd: " + i);
            }
            i--;
        }
    }
}
