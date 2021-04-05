import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private String dateOfBrirth;
    private String address;
    private String position;
    private int basicSalary;

    Scanner sc = new Scanner(System.in);

    public Employee() {
    }

    public void input() {
        System.out.println("Nhap ID:");
        id = sc.nextLine();
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        dateOfBrirth = sc.nextLine();
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
        System.out.println("Nhap vi tri:");
        position = sc.nextLine();
        System.out.println("Nhap luong co ban:");
        basicSalary = sc.nextInt();

    }

    public void show() {
        System.out.println("ID la:" + id);
        System.out.println("Ho ten la:" + name);
        System.out.println("Ngay sinh la:" + dateOfBrirth);
        System.out.println("dia chi la:" + address);
        System.out.println("vi tri hien tai:" + position);
        System.out.println("luong co ban la:" + basicSalary);
    }
//Constructor
    public Employee(String id, String name, String dateOfBrirth, String address, String position, int basicSalary) {
        this.id = id;
        this.name = name;
        this.dateOfBrirth = dateOfBrirth;
        this.address = address;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "ID la:" + id + "\n" + "Ho ten la:" + name + "\n" + "Ngay sinh la:" + dateOfBrirth + "\n" + "Dia chi la:"
                + address + "\n" + "Vi tri hien tai:" + position + "\n" + "Luong co ban la:" + basicSalary;
    }

    // Getter & Setter
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

    public String getDateOfBirth() {
        return dateOfBrirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBrirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}
