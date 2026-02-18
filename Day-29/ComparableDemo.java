import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id; // sort by id
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Ram"));
        list.add(new Student(1, "Krishna"));
        list.add(new Student(2, "Sai"));

        Collections.sort(list);

        System.out.println(list);
    }
}
