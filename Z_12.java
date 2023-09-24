import java.util.Scanner;
import java.util.Arrays;

public class Z_12 {
    public static void main(String[] args) {
        Scanner z12 = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        System.out.println("Введите x: ");
        x = z12.nextInt();
        System.out.println("Введите y: ");
        y = z12.nextInt();
        System.out.println("Введите z: ");
        z = z12.nextInt();
        System.out.println(func_Z12(x, y, z));
    }
    public static String func_Z12(int x, int y, int z) {
        if (x >= 0 || y >= 0 || z > 0) {
            return "Не все числа отрицательные";
        }
        int[] tempArr = { x, y, z };
        Arrays.sort(tempArr);
        String res = "Отсортированный массив: ";
        for (int num : tempArr) {
            res = res + (num + " ");
        }
        return res;
    }
}
