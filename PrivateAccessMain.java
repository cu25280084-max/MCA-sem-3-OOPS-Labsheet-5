class Employee {
    private int id;
    private String name;
    private double salary;
    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    void display() {
        System.out.println(id + " | " + name + " | Rs." + salary);
    }
}
public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Devesh", 30000);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        e.display();
    }
}
