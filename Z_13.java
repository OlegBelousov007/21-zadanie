import java.util.Scanner;

public class Z_13 {
    public static void main(String[] args) {
        Scanner z12 = new Scanner(System.in);
        int x = 0;
        System.out.println("Введите x: ");
        x = z12.nextInt();
        System.out.print(func_Z13(x));
    }
    public static String func_Z13(int y) {
        String res = "";

        switch (y / 10) {
            case 2:
                res = ("двадцать ");
                break;
            case 3:
                res = ("тридцать ");
                break;
            case 4:
                res = ("сорок ");
                break;
            case 5:
                res = ("пятьдесят ");
                break;
            case 6:
                res = ("шестьдесят ");
                break;
        }

        switch (y % 10) {
            case 1:
                res += ("один ");
                break;
            case 2:
                res += ("два ");
                break;
            case 3:
                res += ("три ");
                break;
            case 4:
                res += ("четыре ");
                break;
            case 5:
                res += ("пять ");
                break;
            case 6:
                res += ("шесть ");
                break;
            case 7:
                res += ("семь ");
                break;
            case 8:
                res += ("восемь ");
                break;
            case 9:
                res += ("девять ");
                break;
        }

        switch (y % 10) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                res += ("лет.");
                break;
            case 1:
                res += ("год.");
                break;
            case 2:
            case 3:
            case 4:
                res += ("года.");
                break;
        }

        return res;
    }
}
