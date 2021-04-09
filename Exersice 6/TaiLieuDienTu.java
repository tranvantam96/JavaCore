import java.util.Scanner;

public class TaiLieuDienTu extends Book implements IDownload {
    private int dungLuong;
    private int luotTai;
    private long giaThanh;
    Scanner sc = new Scanner(System.in);
    public TaiLieuDienTu(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, int dungLuong,
            int luotTai, long giaThanh) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan);
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
    }
    public TaiLieuDienTu(){

    }
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap dung luong:");
        dungLuong = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap luot tai:");
        luotTai = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gia thanh:");
        giaThanh = sc.nextLong();
    }
    @Override
    public String toString() {
        return "TaiLieuDienTu [dungLuong=" + dungLuong + ", giaThanh=" + giaThanh + ", luotTai=" + luotTai + "]";
    }
    @Override
    public void tongTien() {
        // TODO Auto-generated method stub
        System.out.println("Tong tien la:" + this.getDungLuong()*this.getGiaThanh()*getLuotTai());
        
    }
    public int getDungLuong() {
        return dungLuong;
    }
    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }
    public int getLuotTai() {
        return luotTai;
    }
    public void setLuotTai(int luotTai) {
        this.luotTai = luotTai;
    }
    public long getGiaThanh() {
        return giaThanh;
    }
    public void setGiaThanh(long giaThanh) {
        this.giaThanh = giaThanh;
    }
    
}
