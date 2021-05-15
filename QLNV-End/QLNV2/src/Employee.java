public class Employee {
    private String id;
    private String name;
    private int age;
    private String address;
    private String department;
    private long basicSalary;
    
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Employee(String id, String name, int age, String address, String department, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
        this.basicSalary = basicSalary;
    }
    public Employee(){

    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + address + " - " + department + " - " + basicSalary;
    }

}
