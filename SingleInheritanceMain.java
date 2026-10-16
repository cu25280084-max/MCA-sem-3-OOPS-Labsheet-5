class Employee {
    protected int id;
    protected String name;
    protected double salary;
    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    void displayEmployee() {
        System.out.println(id + " - " + name + " - Rs." + salary);
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(int id, String name, double salary, String licenseNo) {
        super(id, name, salary); this.licenseNo = licenseNo;
    }
    void display() {
        displayEmployee();
        System.out.println("License: " + licenseNo);
    }
}
public class SingleInheritanceMain {
    public static void main(String[] args) {
        new Pharmacist(101, "Devesh", 30000, "PH101").display();
    }
}
