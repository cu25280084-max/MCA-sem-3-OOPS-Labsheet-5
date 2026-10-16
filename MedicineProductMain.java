class MedicineProduct {
    private String name, batchNo;
    private double price;
    MedicineProduct(String name, String batchNo, double price) {
        this.name = name; this.batchNo = batchNo; this.price = price;
    }
    public String getName() { return name; }
    public String getBatchNo() { return batchNo; }
    public double getPrice() { return price; }
    public void setName(String name) { this.name = name; }
    public void setBatchNo(String batchNo) { this.batchNo = batchNo; }
    public void setPrice(double price) { if (price >= 0) this.price = price; }
    void display() {
        System.out.println(name + " | " + batchNo + " | Rs." + price);
    }
}
public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct p = new MedicineProduct("Paracetamol", "B101", 25);
        p.setPrice(30);
        System.out.println(p.getName());
        p.display();
    }
}
