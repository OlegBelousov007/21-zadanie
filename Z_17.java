import java.util.Scanner;

public class Z_17 {
    public static void main(String[] args) {
        Scanner z17 = new Scanner(System.in);
        int n = 0;
        System.out.println("Введите x: ");
        n = z17.nextInt();
        System.out.println(func_Z17(n));
    }
    public static String func_Z17(int n) {
        double sum = 0;
        double fraction = 9 / 10;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            double iteration = Math.pow(2, i) / (i + Math.pow(2, i));
            if (iteration > fraction)
                count++;

            sum += iteration;
        }

        return "Результат: " + sum + ". Количество: " + count;
    }
}
