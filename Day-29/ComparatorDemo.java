import java.util.*;

class Employee {
    int salary;
    String name;

    Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String toString() {
        return salary + " " + name;
    }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(50000, "A"));
        list.add(new Employee(30000, "B"));
        list.add(new Employee(40000, "C"));

        Collections.sort(list, new SalaryComparator());

        System.out.println(list);
    }
}
