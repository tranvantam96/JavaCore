import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Info {
    Scanner sc = new Scanner(System.in);
    List<Employee> EmployeeList;
    List<Employee> listDepartment;
    static String MYFILE = "InfoEmployee.txt";

    public Info() {
        EmployeeList = new ArrayList<>();
        File myFile = new File(MYFILE);
        try {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String s = myReader.nextLine();
                String str[] = s.split(" - ");
                String id = str[0];
                String name = str[1];
                int age = Integer.valueOf(str[2]);
                String address = str[3];
                String department = str[4];
                long basicSalary = Long.parseLong(str[5]);
                EmployeeList.add(new Employee(id, name, age, address, department, basicSalary));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        EmployeeList.forEach(System.out::println);
    }
    public List<Employee> getEmployeeDepartment(String department){
        listDepartment = new ArrayList<>();
        for (int i = 0; i <EmployeeList.size(); i++){
            if(EmployeeList.get(i).getDepartment().equalsIgnoreCase(department)){
                listDepartment.add(EmployeeList.get(i));
            }
        }
        return listDepartment;
    }
    public void getListDepartment(){
        listDepartment.forEach(System.out::println);
    }
    public void addEmployee() {
        System.out.println("Nhap ID:");
        String id = sc.nextLine();
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi:");
        String address = sc.nextLine();
        System.out.println("Nhap phong ban:");
        String department = sc.nextLine();
        System.out.println("Nhap luong:");
        long basicSalary = Long.parseLong(sc.nextLine());
        EmployeeList.add(new Employee(id, name, age, address, department, basicSalary));
        System.out.println("Danh sach sau khi them:");
        EmployeeList.forEach(System.out::println);
        writeFile();
    }

    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(MYFILE);
            for (Employee e : EmployeeList) {
                fileWriter.write(e.toString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void editEmployee(String IdEmployee) {
        int count = 0;
        for (int i = 0; i < EmployeeList.size(); i++) {
            if (EmployeeList.get(i).getId().equalsIgnoreCase(IdEmployee)) {
                System.out.println(EmployeeList.get(i).toString());
                System.out.println("Nhập ID mới:");
                String id = sc.nextLine();
                EmployeeList.get(i).setId(id);
                System.out.println("Nhập tên mới:");
                String name = sc.nextLine();
                EmployeeList.get(i).setName(name);
                System.out.println("Nhập tuổi mới:");
                int age = Integer.valueOf(sc.nextLine());
                EmployeeList.get(i).setAge(age);
                System.out.println("Nhập địa chỉ mới:");
                String address = sc.nextLine();
                EmployeeList.get(i).setAddress(address);
                System.out.println("Nhập bộ phận mới:");
                String department = sc.nextLine();
                EmployeeList.get(i).setDepartment(department);
                System.out.println("Nhập mức lương mới:");
                long basicSalary = Long.parseLong(sc.nextLine());
                EmployeeList.get(i).setBasicSalary(basicSalary);
                count++;
                System.out.println("Nhân viên sau khi sửa là: ");
                System.out.println(EmployeeList.get(i).toString());
            }

        }
        if (count == 0) {
            System.out.println("Không tìm thấy sản phẩm");
        }
        writeFile();
    }

    public void search(String id) {
        int count = 0;
        for (int i = 0; i < EmployeeList.size(); i++) {
            if (EmployeeList.get(i).getId().equalsIgnoreCase(id)) {
                System.out.println(EmployeeList.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Không có nhân viên này" : "");

    }

    public void deleteEmployee(String id) {
        for (int i = 0; i < EmployeeList.size(); i++) {
            if (EmployeeList.get(i).getId().contains(id)) {
                System.out.println(EmployeeList.get(i).toString());
                EmployeeList.remove(EmployeeList.get(i));
            }
        }
        System.out.println("Xóa thành công!!!");
        System.out.println("Danh sách sau khi xóa: ");
        EmployeeList.forEach(System.out::println);
        writeFile();
    }
    public void getEmployeeSalary(){
        Scanner sc = new Scanner(System.in);
        Select.Filter();
        System.out.print("Lựa chọn của bạn: ");
        int choose = sc.nextInt();
        sc.nextLine();
        int count = 0;
        switch (choose){
            case 1:
                for (int i = 0; i < EmployeeList.size(); i++){
                    if (EmployeeList.get(i).getBasicSalary() < 8000000){
                        System.out.println(EmployeeList.get(i).toString());
                        count++;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < EmployeeList.size(); i++){
                    if (EmployeeList.get(i).getBasicSalary() >= 8000000 && EmployeeList.get(i).getBasicSalary() < 10000000){
                        System.out.println(EmployeeList.get(i).toString());
                        count++;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < EmployeeList.size(); i++){
                    if (EmployeeList.get(i).getBasicSalary() > 10000000){
                        System.out.println(EmployeeList.get(i).toString());
                        count++;
                    }
                }
                break;
        }
        System.out.println((count == 0) ? "Không có sản phẩm này": "");

    }
}
