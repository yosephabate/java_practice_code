public class Operators {
    public static void main(String[] args) {
        boolean a = false;
        int b = 3;

        System.out.println(a & (b++ > 3));
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
