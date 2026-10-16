class MedicalStaff {
    protected int id;
    protected String name;
    MedicalStaff(int id, String name) { this.id = id; this.name = name; }
}
class Doctor extends MedicalStaff {
    private String specialization;
    Doctor(int id, String name, String specialization) {
        super(id, name); this.specialization = specialization;
    }
    void display() {
        System.out.println("Doctor: " + id + " | " + name + " | " + specialization);
    }
}
class Pharmacist extends MedicalStaff {
    private String license;
    Pharmacist(int id, String name, String license) {
        super(id, name); this.license = license;
    }
    void display() {
        System.out.println("Pharmacist: " + id + " | " + name + " | " + license);
    }
}
public class MedicalStaffMain {
    public static void main(String[] args) {
        new Doctor(101, "Amit", "Cardiology").display();
        new Pharmacist(102, "Devesh", "PH102").display();
    }
}
