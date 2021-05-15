import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách nhân viên:");
        Info info = new Info();
        Select.choose();
        while (true) {
            System.out.println("Bạn muốn tiếp tục: \nY để tiếp tục \nN để thoát chương trình");
            System.out.println("Lựa chọn của bạn: ");
            String chooses = sc.nextLine();
            if (chooses.equalsIgnoreCase("y")) {
                Select.choose();
                System.out.println("Lựa chọn của bạn:");
                int i = sc.nextInt();
                sc.nextLine();
                switch (i) {
                    case 1:
                        System.out.println("IT, Accout, Sale, Purchase");
                        System.out.println("Nhập bộ phận:");
                        String department = sc.nextLine();
                        info.getEmployeeDepartment(department);
                        info.getListDepartment();
                        break;
                    case 2:

                        System.out.println("Nhap ID nhân viên cần tìm kiếm:");
                        String id = sc.nextLine();
                        info.search(id);
                        break;
                    case 3:
                        info.addEmployee();
                        break;
                    case 4:
                        System.out.println("Nhập id nhân viên muốn sửa");
                        id = sc.nextLine();
                        info.editEmployee(id);
                    case 5:
                        System.out.println("Nhap nhan vien can xoa");
                        id = sc.nextLine();
                        info.deleteEmployee(id);
                    case 6:
                        info.getEmployeeSalary();
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");

                }
            } else if (chooses.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }
    }
}
