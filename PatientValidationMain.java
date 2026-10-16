class Patient {
    private String name;
    private int age;
    private double weight;
    Patient(String name, int age, double weight) {
        this.name = name; setAge(age); setWeight(weight);
    }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Invalid age");
    }
    public void setWeight(double weight) {
        if (weight > 0) this.weight = weight;
        else System.out.println("Invalid weight");
    }
    void display() {
        System.out.println(name + " | Age: " + age + " | Weight: " + weight);
    }
}
public class PatientValidationMain {
    public static void main(String[] args) {
        Patient p = new Patient("Devesh", 20, 83);
        p.setAge(21); p.setAge(-5); p.setWeight(82.5);
        p.display();
    }
}
