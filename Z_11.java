import java.util.Scanner;

public class Z_11 {
    public static void main(String[] args) {
        Scanner z11 = new Scanner(System.in);
        double x = 0;
        double y = 0;
        System.out.println("Введите x: ");
        x = z11.nextDouble();
        System.out.println("Значение y = " + func_Z11(x));
    }
    public static double func_Z11(double x) {
        if (x > 2.5) {
            return Math.sin((2.3 * x) - 1);
        } else if (x >= 0) {
            return (1 - (3 * Math.log(Math.abs(1 - x))));
        }
        return ((Math.pow(x, 2)) / (2 - x));
    }
}
