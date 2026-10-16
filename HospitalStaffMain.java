class Person {
    protected String name;
    protected int age;
    Person(String name, int age) { this.name = name; this.age = age; }
}
class Employee extends Person {
    private int id;
    private double salary;
    static int employeeCount = 0;
    Employee(String name, int age, int id, double salary) {
        super(name, age); this.id = id; setSalary(salary); employeeCount++;
    }
    public int getId() { return id; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { if (salary >= 0) this.salary = salary; }
    protected void displayBasic() {
        System.out.println("ID: " + id + " | " + name + " | Age: " + age + " | Salary: Rs." + salary);
    }
}
class Doctor extends Employee {
    private String specialization;
    Doctor(String n, int a, int id, double s, String specialization) {
        super(n, a, id, s); this.specialization = specialization;
    }
    void display() { displayBasic(); System.out.println("Doctor: " + specialization); }
}
class Pharmacist extends Employee {
    private String license;
    Pharmacist(String n, int a, int id, double s, String license) {
        super(n, a, id, s); this.license = license;
    }
    void display() { displayBasic(); System.out.println("Pharmacist: " + license); }
}
class StaffManager {
    void displayStaff(Employee[] staff) {
        int doctors = 0, pharmacists = 0;
        for (Employee e : staff) {
            if (e instanceof Doctor) { ((Doctor) e).display(); doctors++; }
            else if (e instanceof Pharmacist) { ((Pharmacist) e).display(); pharmacists++; }
            System.out.println();
        }
        System.out.println("Doctors: " + doctors);
        System.out.println("Pharmacists: " + pharmacists);
        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}
public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Amit", 35, 101, 60000, "Cardiology"),
            new Pharmacist("Devesh", 20, 102, 30000, "PH102")
        };
        new StaffManager().displayStaff(staff);
    }
}
