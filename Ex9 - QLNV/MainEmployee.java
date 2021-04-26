import java.util.ArrayList;
import java.util.Collections;

public class MainEmployee {
    public static void main(String[] args) {
        ArrayList<Waiter> waiter = new ArrayList<>();
        waiter.add(new Waiter(1, "T", 23, 1000, 2000));
        waiter.add(new Waiter(3, "D", 22, 4000, 6000));
        waiter.add(new Waiter(2, "C", 24, 5000, 5000));
        waiter.add(new Waiter(4, "M", 21, 2000, 3000));
        System.out.println("Danh sach Waiter:");
        waiter.forEach(n -> System.out.println(n.toString()));
        System.out.println("Danh sach Waiter sap xep theo ten:");
        Collections.sort(waiter, Employee::compareByName);
        waiter.forEach(System.out::println);
        System.out.println("Danh sach Waiter sap xep theo luong:");
        Collections.sort(waiter, (o1, o2) -> Waiter.compareBySalary(o1, o2));
        waiter.forEach(System.out::println);
        System.out.printf("-------------------------\n");
        ArrayList<Kitchen> kitchen = new ArrayList<>();
        kitchen.add(new Kitchen(4, "A", 26, 1000, 3000));
        kitchen.add(new Kitchen(6, "Y", 29, 7000, 5000));
        kitchen.add(new Kitchen(5, "P", 28, 9000, 7000));
        kitchen.add(new Kitchen(5, "D", 25, 6000, 4000));
        System.out.println("Danh sach Kitchen:");
        kitchen.forEach(n -> System.out.println(n.toString()));
        System.out.println("Danh sach Waiter sap xep theo ten:");
        Collections.sort(kitchen, Employee::compareByName);
        kitchen.forEach(System.out::println);
        System.out.println("Danh sach Waiter sap xep theo luong:");
        Collections.sort(kitchen, (o1, o2) -> Kitchen.compareBySalary(o1, o2));
        kitchen.forEach(System.out::println);

    }
}
