import java.util.Scanner;

public class Employee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien:");
        int a = sc.nextInt();
        Employee[] nv = new Employee[a];
        for (int i = 0; i < nv.length; i++) {
            nv[i] = new Employee();
            nv[i].input();
        }
        for (int i = 0; i < nv.length; i++) {
            System.out.println("Nhan vien thu" + i + "la:");
            nv[i].show();
        }
        Employee nv2 = new Employee();
        nv2.input();
        System.out.println("Contructor la: \n" + nv2.toString());
        // Setter & Getter
        Employee t = new Employee();
        t.setId("123456789");
        t.setName("Tam");
        t.setDateOfBirth("23/09/1996");
        t.setAddress("Bac Ninh");
        t.setPosition("Staff");
        t.setBasicSalary(7000000);
        System.out.println("Thong tin Getter&Setter la:");
        System.out.println("ID moi la:" + t.getId());
        System.out.println("Ten moi la:" + t.getName());
        System.out.println("Ngay sinh moi la:" + t.getDateOfBirth());
        System.out.println("Dia chi moi la:" + t.getAddress());
        System.out.println("Vi tri moi la:" + t.getPosition());
        System.out.println("Luong co ban moi la:" + t.getPosition());
    }
}
