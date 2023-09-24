import java.util.Scanner;

public class Z_5 {
    public static void main(String[] args) {
        Scanner z4 = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Введите x: ");
        x = z4.nextInt();
        System.out.println("Введите y: ");
        y = z4.nextInt();


        if (x>0 && y>0) System.out.println("I");
    else
        if (x<0 && y>0) System.out.println("II");
        else
        if (x<0 && y<0) System.out.println("III");
            else
        if (x>0 && y<0) System.out.println("IV");

    }
}
