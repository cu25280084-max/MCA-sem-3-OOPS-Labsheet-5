class HospitalStaff {
    protected int staffId;
    protected String staffName;
    protected HospitalStaff(int id, String name) {
        staffId = id; staffName = name;
    }
    protected void displayStaff() {
        System.out.println(staffId + " - " + staffName);
    }
}
class Pharmacist extends HospitalStaff {
    private String licenseNo;
    Pharmacist(int id, String name, String licenseNo) {
        super(id, name); this.licenseNo = licenseNo;
    }
    void display() {
        displayStaff();
        System.out.println("License: " + licenseNo);
    }
}
public class ProtectedAccessMain {
    public static void main(String[] args) {
        new Pharmacist(101, "Devesh", "PH101").display();
    }
}
