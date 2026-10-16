class Pharmacy {
    String pharmacyName, location;
    static int pharmacyCount = 0;
    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }
    void display() {
        System.out.println(pharmacyName + " - " + location);
    }
}
public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("Devesh Pharmacy", "Moradabad");
        Pharmacy p2 = new Pharmacy("City Pharmacy", "Roorkee");
        p1.display();
        p2.display();
        System.out.println("Total Pharmacies: " + Pharmacy.pharmacyCount);
    }
}
