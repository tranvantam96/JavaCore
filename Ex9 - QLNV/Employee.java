import java.util.Scanner;

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private long basicSalary;

    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return "Employee [age=" + age + ", basicSalary=" + basicSalary + ", id=" + id + ", name=" + name + "]";
    }

    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public static int compareByName(Employee p1, Employee p2) {
        return p1.getName().compareTo(p2.getName());
    }
}