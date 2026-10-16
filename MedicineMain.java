class Medicine {
    String medicineName, batchNo;
    double price;
    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }
    void display() {
        System.out.println(medicineName + " | " + batchNo + " | Rs." + price);
    }
}
public class MedicineMain {
    public static void main(String[] args) {
        new Medicine("Paracetamol", "B101", 25).display();
        new Medicine("Vitamin C", "B102", 40).display();
    }
}
