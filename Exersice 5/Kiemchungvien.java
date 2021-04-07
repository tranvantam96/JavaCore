import java.util.Scanner;

public class Kiemchungvien extends NhanVien {
    private int soLoi;
    Scanner sc = new Scanner(System.in);

    public Kiemchungvien(String id, String name, int age, String phoneNumber, String email, long basicSalary,
            int soLoi) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.soLoi = soLoi;
    }

    public Kiemchungvien() {
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so loi bat duoc:");
        soLoi = Integer.valueOf(sc.nextLine());
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        super.show();
        System.out.println("So loi bat duoc la:" + soLoi);
    }

    public int getSoLoi() {
        return soLoi;
    }

    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

    public long luongKiemchung() {
        return this.getBasicSalary() + this.getSoLoi() * 50000;
    }
}
