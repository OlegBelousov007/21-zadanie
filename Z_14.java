import java.util.Scanner;

public class Z_14 {
    public static void main(String[] args) {
        Scanner z14 = new Scanner(System.in);
        int x = 0;
        double a = 0;
        System.out.println("Введите x: ");
        x = z14.nextInt();
        System.out.println("Введите a: ");
        a = z14.nextDouble();
        System.out.println("Результат равен: " + func_Z14(a, x));
    }
    public static double func_Z14(double a, int n) {
        double res = 1;
        for (int i = 1; i <= n; i++) {
            res += Math.pow(a, i);
        }
        return res;
    }
}
