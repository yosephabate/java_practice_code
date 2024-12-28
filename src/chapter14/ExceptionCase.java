package chapter14;

public class ExceptionCase {
    public static int average(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }

        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }

        return total / a.length;
    }

    public static void main(String[] args) {
        try {
            int[] nums = {};
            System.out.println(average(nums));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
