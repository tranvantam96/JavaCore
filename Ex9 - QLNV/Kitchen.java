public class Kitchen extends Employee {
    private long serviceCharge;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "serviceCharge=" + serviceCharge + "]" + "Luong cua Kitchen:" + calculatorSalary();
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Kitchen(int id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public Kitchen(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Kitchen() {

    }

    public long calculatorSalary() {
        return serviceCharge + getBasicSalary();
    }

    public static int compareBySalary(Kitchen o1, Kitchen o2) {
        return o1.calculatorSalary() > o2.calculatorSalary() ? 1 : -1;
    }
}
