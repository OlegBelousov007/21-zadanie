public class Z_20 {
    public static void main(String[] args) {
        double maxVal = 0.865;
        for (int n = 1; n <= 100; n++) {
            double res = Math.pow(2, n) / (n + Math.pow(2, n));
            if (res > maxVal) {
                System.out.println("Найденное n: " + n);
                return;
            }
        }
        System.out.println("n найти не удалось");
    }
}
