import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap lua chon cua ban:");
            System.out.println("Y - doi hinh 4-4-2:");
            System.out.println("S - chon doi hinh cua ban:");
            System.out.println("N - Thoat chuong trinh:");
            String choose = sc.nextLine();
            switch (choose) {
            case "Y":
                Team team = new Team();
                team.getAllPlayer();
                team.buildTeam(4, 4, 2);
                team.showBuild();
                break;
            case "S":
                Team team2 = new Team();
                System.out.println("Nhap hang hau ve:");
                int i = Integer.valueOf(sc.nextLine());
                System.out.println("Nhap hang trung ve:");
                int j = Integer.valueOf(sc.nextLine());
                System.out.println("Nhap hang tien dao:");
                int k = Integer.valueOf(sc.nextLine());
                team2.getAllPlayer();
                team2.buildTeam(i, j, k);
                team2.showBuild();
                break;
            case "N":
                System.exit(0);
                break;
            }
        }
    }
}
