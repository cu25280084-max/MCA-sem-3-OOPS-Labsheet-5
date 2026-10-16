class Person {
    protected String name;
    protected int age;
    Person(String name, int age) { this.name = name; this.age = age; }
}
class Employee extends Person {
    private int employeeId;
    Employee(String name, int age, int employeeId) {
        super(name, age); this.employeeId = employeeId;
    }
    int getEmployeeId() { return employeeId; }
}
class Manager extends Employee {
    private int teamSize;
    Manager(String name, int age, int id, int teamSize) {
        super(name, age, id); this.teamSize = teamSize;
    }
    void display() {
        System.out.println(name + " | " + age + " | " + getEmployeeId() + " | Team: " + teamSize);
    }
}
public class MultilevelMain {
    public static void main(String[] args) {
        new Manager("Devesh", 20, 101, 8).display();
    }
}
