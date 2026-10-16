class Hospital {
    public String hospitalName = "City Hospital";
    public String hospitalCode = "H101";
    public void display() {
        System.out.println(hospitalName + " - " + hospitalCode);
    }
}
public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        System.out.println(h.hospitalName);
        System.out.println(h.hospitalCode);
        h.display();
    }
}
