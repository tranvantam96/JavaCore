import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so Lap trinh vien:");
        int a = Integer.valueOf(sc.nextLine());
        Laptrinhvien[] ltv = new Laptrinhvien[a];
        for (int i = 0; i < a; i++) {
            ltv[i] = new Laptrinhvien();
            System.out.println("Nhap thong tin Lap trinh vien:");
            ltv[i].input();
        }
        for (int i = 0; i < a; i++) {
            System.out.println("Thong tin Lap trinh vien:" + ltv[i].toString());
            System.out.println("Tong luong lap trinh vien la:" + ltv[i].luongLTV());
        }
        System.out.println("Nhap so Kiem chung vien:");
        int b = Integer.valueOf(sc.nextLine());
        Kiemchungvien[] ktv = new Kiemchungvien[b];
        for (int j = 0; j < b; j++) {
            ktv[j] = new Kiemchungvien();
            System.out.println("Nhap thong tin kiem chung vien:");
            ktv[j].input();
        }
        for (int j = 0; j < b; j++) {
            System.out.println("Thong tin kiem chung vien la:" + ktv[j].toString());
            System.out.println("Tong luong kiem chung vien la:" + ktv[j].luongKiemchung());
        }
    }
}
