public class Factorial {

    public static long factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int v = 17;
        System.out.println(factorial(v));
    }
}
