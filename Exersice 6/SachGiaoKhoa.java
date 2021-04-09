import java.util.Scanner;

public class SachGiaoKhoa extends Book implements IMuon,IKho {
    private int soTrang;
    private String tinhTrang;
    private int tongSoLuong;
    private int soLuongMuon;
    Scanner sc = new Scanner(System.in);

    public SachGiaoKhoa(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soTrang, String tinhTrang,
            int tongSoLuong, int soLuongMuon) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.tongSoLuong = tongSoLuong;
        this.soLuongMuon = soLuongMuon;
    }

    public SachGiaoKhoa() {

    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap so trang:");
        soTrang = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap tinh trang:");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap tong so luong:");
        tongSoLuong = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap so luong muon:");
        soLuongMuon = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa [soLuongMuon=" + soLuongMuon + ", soTrang=" + soTrang + ", tinhTrang=" + tinhTrang
                + ", tongSoLuong=" + tongSoLuong + "]";
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

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }
public int caculatorTonKho(){
    return this.getTongSoLuong()-getSoLuongMuon();
}
    @Override
    public void tonKho() {
        // TODO Auto-generated method stub
        System.out.println("Ton kho la:" + caculatorTonKho() );
    }

    @Override
    public void viTri() {
        // TODO Auto-generated method stub
        System.out.println("Vi tri: Tren ke so 1");
    }

}
