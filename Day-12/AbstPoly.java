abstract class Employee {
    abstract void calculateSalary();
}

class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Salary = 50000");
    }
}

class Tester extends Employee {
    void calculateSalary() {
        System.out.println("Salary = 40000");
    }
}

public class AbstPoly {
    public static void main(String[] args) {
        Employee e;

        e = new Developer();
        e.calculateSalary();

        e = new Tester();
        e.calculateSalary();
    }
}
