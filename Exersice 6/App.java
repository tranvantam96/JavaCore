public class App {
    public static void main(String[] args) throws Exception {
        SachGiaoKhoa sachgiaokhoa = new SachGiaoKhoa();
        System.out.println("Nhap thong tin SGK:");
        sachgiaokhoa.input();
        sachgiaokhoa.toString();
        sachgiaokhoa.tonKho();
        sachgiaokhoa.viTri();
        DoAn doan = new DoAn();
        System.out.println("Nhap thong tin Do An:");
        doan.input();
        doan.toString();
        doan.viTri();
        TaiLieuDienTu tailieudientu = new TaiLieuDienTu();
        System.out.println("Nhap thong tin Tai Lieu Dien Tu:");
        tailieudientu.input();
        tailieudientu.toString();
        tailieudientu.tongTien();
    }
}
