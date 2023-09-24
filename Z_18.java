public class Z_18 {
    public static void main(String[] args) {
        double maxVal = 0.8;
        for (double n = 0; n <= 10; n=n+0.1) {
            double res = Math.pow(2, n) / (n + Math.pow(2, n));
            if (res < maxVal) {
                System.out.println("Найденное n: " + n);
                return;
            }
        }
        System.out.println("n найти не удалось");
    }
}
