public class Fibonacci {
    public static void main(String[] args) {
        double[][] pressure = {
                {0, 2, 4},
                {4, 5},
                {7, 8, 9}
        };

        for (int i = 0; i < pressure.length; i++) {
            for (int j = 0; j < pressure[i].length; j++) {
                System.out.println(pressure[i][j]);
            }
        }
    }
}
