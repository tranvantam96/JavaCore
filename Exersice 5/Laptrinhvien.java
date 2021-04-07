import java.util.Scanner;
import java.math.*;

public class Laptrinhvien extends NhanVien {
    private int overtime;
    Scanner sc = new Scanner(System.in);

    public Laptrinhvien() {

    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap Overtime:");
        overtime = Integer.valueOf(sc.nextLine());
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        super.show();
        System.out.println("Over time la:" + overtime);
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public Laptrinhvien(String id, String name, int age, String phoneNumber, String email, long basicSalary,
            int overtime) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.overtime = overtime;
    }

    public long luongLTV() {
        return this.getBasicSalary() + this.getOvertime() * 200000;
    }
}
