class Employee {
    private int id;
    private String name;
    private double salary;
    static int employeeCount = 0;
    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; setSalary(salary); employeeCount++;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else System.out.println("Invalid salary");
    }
    protected void displayBasic() {
        System.out.println("ID: " + id + " | " + name + " | Salary: Rs." + salary);
    }
    void displayRole() { System.out.println("Role: Employee"); }
}
class Pharmacist extends Employee {
    private String license;
    Pharmacist(int id, String name, double salary, String license) {
        super(id, name, salary); this.license = license;
    }
    void display() { displayBasic(); System.out.println("Role: Pharmacist | License: " + license); }
    @Override void displayRole() { display(); }
}
class StoreManager extends Employee {
    private int section;
    StoreManager(int id, String name, double salary, int section) {
        super(id, name, salary); this.section = section;
    }
    void display() {
        displayBasic();
        System.out.println("Role: Store Manager | Section: " + section);
    }
    @Override void displayRole() { display(); }
}
class PharmacyManager {
    void processEmployees(Employee[] employees) {
        double totalSalary = 0;
        for (Employee e : employees) {
            e.displayRole();
            totalSalary += e.getSalary();
            System.out.println();
        }
        System.out.println("Total Employees: " + employees.length);
        System.out.println("Registered Employees: " + Employee.employeeCount);
        System.out.println("Total Salary: Rs." + totalSalary);
    }
}
public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(101, "Devesh", 30000, "PH101"),
            new StoreManager(102, "Amit", 40000, 2)
        };
        new PharmacyManager().processEmployees(employees);
    }
}
