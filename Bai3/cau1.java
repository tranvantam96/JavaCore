import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = sc.nextInt();
        n[2] = sc.nextInt();
        n[1] = sc.nextInt();
        int max = n[0];
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > max)
                max = n[i];
            if (min > n[i])
                min = n[i];
            System.out.println("So lon nhat la:" + max);
            System.out.println("So nho nhat la:" + min);
        }

    }
}
