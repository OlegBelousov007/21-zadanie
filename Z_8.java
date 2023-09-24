import java.util.Scanner;

public class Z_8 {
    public static void main(String[] args) {
        Scanner z8 = new Scanner(System.in);
        int k = 0;
        System.out.println("Введите трёхзначное число: ");
        k = z8.nextInt();

        int d1 = k % 10;
        k = k / 10;
        int d2 = k % 10;
        k = k / 10;

        int sum = d1 + d2 + k;
        if (sum < 15)
            System.out.println(sum + " является ");
        else
            System.out.println(sum + " не является ");

    }
}
