import java.util.Scanner;

public class DoAn extends Book implements IKho{
    private int soTrang;
    private String tinhTrang;
    private int namBaoVe;
    Scanner sc = new Scanner(System.in);

    public DoAn(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soTrang, String tinhTrang,
            int namBaoVe) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBaoVe = namBaoVe;
    }

    public DoAn() {

    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so trang:");
        soTrang = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap tinh trang:");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap nam bao ve:");
        namBaoVe = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return "DoAn [namBaoVe=" + namBaoVe + ", soTrang=" + soTrang + ", tinhTrang=" + tinhTrang + "]";
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getNamBaoVe() {
        return namBaoVe;
    }

    public void setNamBaoVe(int namBaoVe) {
        this.namBaoVe = namBaoVe;
    }
    @Override
    public void viTri() {
        // TODO Auto-generated method stub
        System.out.println("Vi tri: ke so 2");
    }

}
