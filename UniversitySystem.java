// UniversitySystem.java

public class UniversitySystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");

        // Create courses
        Course course1 = new Course(1, "Introduction to Java");
        Course course2 = new Course(2, "Advanced Java Programming");

        // Perform registrations
        Registration registration1 = new Registration(student1);
        Registration registration2 = new Registration(student2);

        course1.addRegistration(registration1);
        course2.addRegistration(registration2);

        // Display information
        System.out.println("Course Information:");
        course1.displayInfo();
        System.out.println();
        course2.displayInfo();
    }
}
