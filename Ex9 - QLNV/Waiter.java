public class Waiter extends Employee {
    private long compensate;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "[compensate=" + compensate + "]" + "Luong cua Waiter:" + calculatorSalary();
    }

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public Waiter() {

    }

    public Waiter(long compensate) {
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    public long calculatorSalary() {
        return compensate + getBasicSalary();
    }

    public static int compareBySalary(Waiter p1, Waiter p2) {
        return p1.calculatorSalary() > p2.calculatorSalary() ? 1 : -1;

    }
}
