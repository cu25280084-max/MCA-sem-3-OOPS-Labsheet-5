class Student {
    String name = "Devesh";
    int rollNo = 101;
    double marks = 78.5;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}
