class Pharmacy {
    String medicineName = "Paracetamol";
    double price = 25;
    void display() { System.out.println(medicineName + " - Rs." + price); }
}
public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy p = new Pharmacy();
        System.out.println(p.medicineName);
        System.out.println(p.price);
        p.display();
    }
}
