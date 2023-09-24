import java.util.Scanner;

public class Z_9 {
    public static void main(String[] args) {
        Scanner z9 = new Scanner(System.in);
        int  x1, x2, x3, x4, y1, y2, y3, y4;
        int s, s1, s2, s3;
        System.out.println("\nВведите координаты четырёх вершин: ");
        System.out.println("x1=");
        x1 = z9.nextInt();
        System.out.println("y1=");
        y1 = z9.nextInt();
        System.out.println("x2=");
        x2 = z9.nextInt();
        System.out.println("y2=");
        y2 = z9.nextInt();
        System.out.println("x3=");
        x3 = z9.nextInt();
        System.out.println("y3");
        y3 = z9.nextInt();
        System.out.println("x4=");
        x4 = z9.nextInt();
        System.out.println("y4=");
        y4 = z9.nextInt();

        double d1= Math.sqrt(x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);
        double d2= Math.sqrt(x4-x1)*(x4-x2)+(y4-y2)*(y4-y2);
        if (d1==d2)//Это прямоугольник
            System.out.println("Это прямоугольник ");
        else//Не прямоугольник
            System.out.println("Это не прямоугольник ");
    }
}
