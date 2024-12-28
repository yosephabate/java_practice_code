public class MyMath {
    public static final double PI = 3.14159;

    public static double square(double x) {
        return x * x;
    }

    public static double area(double x) {
        return PI * x * x;
    }

    public static void main(String[] args) {
        MyMath m = new MyMath();
        System.out.printf("m: value of PI is %f\n", MyMath.PI);
        System.out.printf("m: square of 5 is %.2f\n", MyMath.square(5));

        System.out.printf("math: value of PI is %f\n", Math.PI);
        System.out.printf("math: square of 5 is %.2f\n", Math.pow(5, 2));

    }
}
