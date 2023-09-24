public class Z_19 {
    public static void main(String[] args) {
        for (double x = 0; x <= 1; x = x + 0.1) {
            double res = Math.pow(Math.sin(Math.exp(x + 1)), 2);
            System.out.println(String.format("%,.1f", x) + ": " + res);

        }
    }
}
