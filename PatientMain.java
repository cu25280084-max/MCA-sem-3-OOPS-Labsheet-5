class Patient {
    int id, age;
    String name;
    Patient(int id, String name, int age) {
        this.id = id; this.name = name; this.age = age;
    }
    void display() {
        System.out.println(id + " | " + name + " | " + age);
    }
}
class PatientManager {
    void displayAll(Patient[] patients) {
        for (Patient patient : patients) patient.display();
    }
}
public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Devesh", 20), new Patient(2, "Amit", 25),
            new Patient(3, "Rahul", 30), new Patient(4, "Rohit", 22),
            new Patient(5, "Vikas", 28)
        };
        new PatientManager().displayAll(patients);
    }
}
