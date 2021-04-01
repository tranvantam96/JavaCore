import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi 1:");
        String chuoi1 = sc.nextLine();
        System.out.println("Nhap vao chuoi 2:");
        String chuoi2 = sc.nextLine();
        System.out.println("ket qua:"+ chuoi1.equalsIgnoreCase(chuoi2));
    }
    
}
