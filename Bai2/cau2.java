import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Chuỗi Fibonacci " + n + " số là: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
