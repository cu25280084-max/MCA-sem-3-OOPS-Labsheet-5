class Person {
    protected String name;
    protected int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    void displayPerson() { System.out.println(name + " | " + age); }
}
class Doctor extends Person {
    private String specialization;
    Doctor(String name, int age, String specialization) {
        super(name, age); this.specialization = specialization;
    }
    void display() { displayPerson(); System.out.println("Specialization: " + specialization); }
}
class Nurse extends Person {
    private String ward;
    Nurse(String name, int age, String ward) {
        super(name, age); this.ward = ward;
    }
    void display() { displayPerson(); System.out.println("Ward: " + ward); }
}
public class HierarchicalMain {
    public static void main(String[] args) {
        new Doctor("Amit", 35, "Cardiology").display();
        new Nurse("Devesh", 20, "Emergency").display();
    }
}
