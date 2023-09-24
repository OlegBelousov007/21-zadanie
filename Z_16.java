import java.util.Scanner;

public class Z_16 {
    public static void main(String[] args) {
        Scanner z16 = new Scanner(System.in);
        int n = 0;
        System.out.println("Введите x: ");
        n = z16.nextInt();
        int resault = 1;
        for (int i=1; i<=n; i++) {
            if (i % 2 == 0)
                resault = resault * i;
        }
        System.out.println("Произведение чётных чисел равно: " + resault);
    }
}
