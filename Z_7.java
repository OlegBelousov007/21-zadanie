import java.util.Scanner;

public class Z_7 {
    public static void main(String [] args) {
        Scanner z7 = new Scanner(System.in);
        int x, y, x1, y1, x2, y2, x3, y3;
        int s, s1, s2, s3;
        System.out.println("\nВведите координаты треугольника:");
        System.out.println("x1=");
        x1 = z7.nextInt();
        System.out.println("y1=");
        y1 = z7.nextInt();
        System.out.println("x2=");
        x2 = z7.nextInt();
        System.out.println("y2=");
        y2 = z7.nextInt();
        System.out.println("x3=");
        x3 = z7.nextInt();
        System.out.println("y3");
        y3 = z7.nextInt();
        System.out.println("\nВведите координаты M(x:y): ");
        System.out.println("y=");
        x = z7.nextInt();
        System.out.println("x=");
        y = z7.nextInt();
        if ((x1==x2 & x2 == x3) ||(y1==y2 & y2==y3))
        {
            System.out.println("\nНеверные координаты треугольника");
        }
        {
            s = 1 / 2 *Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
            s1 = 1 / 2 *Math.abs((x2 - x1) * (y - y1) - (x - x1) * (y2 - y1));
            s2 = 1 / 2 *Math.abs((x - x1) * (y3 - y1) - (x3 - x1) * (y - y1));
            s3 = 1 / 2 *Math.abs((x2 - x) * (y3 - y) - (x3 - x) * (y2 - y));

            if (s == s1 + s2 + s3)

                System.out.println("\n Точка на стороне треугольника ");
            else
                System.out.println("\n Точка не на стороне треугольника");

        }



    }
}
