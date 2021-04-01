import java.util.Scanner;
import java.lang.Math;

public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        double a = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao so b");
        double b = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao so c");
        double c = sc.nextInt();
        sc.nextLine();
        double delta = b * b - (4 * a * c);
        double x1;
        double x2;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co nghiem x1:" + x1);
            System.out.println("Phuong trinh co nghiem x2:" + x2);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
        if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep:" + x1);
        }
    }
}