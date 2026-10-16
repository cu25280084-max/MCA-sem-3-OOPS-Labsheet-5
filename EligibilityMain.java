class Medicine {
    String name;
    int ageLimit;
    Medicine(String name, int ageLimit) {
        this.name = name; this.ageLimit = ageLimit;
    }
    String checkEligibility(int age) {
        return age >= ageLimit ? "Eligible" : "Not Eligible";
    }
}
public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Example Medicine", 18);
        System.out.println(medicine.checkEligibility(20));
        System.out.println(medicine.checkEligibility(15));
    }
}
