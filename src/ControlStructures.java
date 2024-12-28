/**
 *
 */

public class ControlStructures {

    /**
     * @param args
     */

    public static void main(String[] args) {

        // single line comment
        /*
        multiple line comment
         */


        char grade = 'C';


        /*
        if (grade == 'A') {
            System.out.println("You got A");
        } else if (grade == 'B') {
            System.out.println("You got B");
        } else if (grade == 'C') {
            System.out.println("You got C");
        } else if (grade == 'D') {
            System.out.println("You got D");
        } else {
            System.out.println("You got F");
        }

        switch (grade) {
            case 'A' -> System.out.println("You got A");
            case 'B' -> System.out.println("You got B");
            case 'C' -> System.out.println("You got C");
            case 'D' -> System.out.println("You got D");
            default -> System.out.println("You got F");
        }

         */

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }


    }
}
