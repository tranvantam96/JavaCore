import java.util.Scanner;

public class NhanVien {
    private String id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private long basicSalary;
    Scanner sc = new Scanner(System.in);

    public NhanVien(String id, String name, int age, String phoneNumber, String email, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public NhanVien() {
    }

    public void input() {
        System.out.println("Nhap ID:");
        id = sc.nextLine();
        System.out.println("Nhap Ten:");
        name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap sdt:");
        phoneNumber = sc.nextLine();
        System.out.println("Nhap email:");
        email = sc.nextLine();
        System.out.println("Nhap luong");
        basicSalary = sc.nextLong();
    }

    public void show() {
        System.out.println("ID:" + id);
        System.out.println("Ten:" + name);
        System.out.println("Tuoi:" + age);
        System.out.println("Sdt:" + phoneNumber);
        System.out.println("Email:" + email);
        System.out.println("Luong co ban:" + basicSalary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public long getTinhLuong() {
        return tinhLuong;
    }

    @Override
    public String toString() {
        return "NhanVien [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber
                + ", basicSalary=" + basicSalary + ", email=" + email + "]";
    }
}
