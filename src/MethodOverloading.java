public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        double x = 6;
        double y = 5;

        System.out.println(add(x, y));
    }
}
