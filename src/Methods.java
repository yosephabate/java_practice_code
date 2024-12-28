public class Methods {

    public static String fullSentence(String name, int age) {
        return name + " " + age;
    }

    public static void printMe() {
        System.out.println("Hi there!");
    } // Implicit return

    public static int add(int a, int b) {
        return a + b; // Explicit return
    }

    public static double abs(double value) {
        if (value < 0) {
            return -value;
        } else {
            return value;
        }

        //System.out.println("Inside abs method");
    }

    public static void main(String[] args) {
        double v = -9;
        System.out.println(abs(v));

        System.out.println(fullSentence("Azeb", 20));
    }
}
