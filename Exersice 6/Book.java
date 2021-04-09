import java.util.Scanner;

public abstract class Book{
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int namXuatBan;
    Scanner sc = new Scanner(System.in);

    public Book(String maSach, String tenSach, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public Book() {

    }

    public void input() {
        System.out.println("Nhap ma sach:");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach:");
        tenSach = sc.nextLine();
        System.out.println("Nhap nha xuat ban:");
        nhaXuatBan = sc.nextLine();
        System.out.println("Nhap nam xuat ban:");
        namXuatBan = Integer.valueOf(sc.nextLine());
    }

    public String toString() {
        return "Book [maSach=" + maSach + ", namXuatBan=" + namXuatBan + ", nhaXuatBan=" + nhaXuatBan + ", tenSach="
                + tenSach + "]";
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }
}
