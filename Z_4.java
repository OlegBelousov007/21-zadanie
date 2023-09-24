import java.util.Scanner;

public class Z_4 {
    public static void main(String[] args) {
        Scanner z4 = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Введите x: ");
        x = z4.nextInt();
        System.out.println("Введите y: ");
        y = z4.nextInt();
        System.out.println("Результат деления равен: " + calculation(x, y));
    }
    public static double calculation(int x, int y){
        double result =  (((Math.pow(x, 2)) + (3 * x) - 1) / (5 + (Math.pow(x, 4)))) / (Math.pow(y, 2));
        return result;
    }
}
