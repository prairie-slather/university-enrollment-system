// Registration.java

import java.util.Date;

public class Registration {
    private Date registrationDate;
    private Student student;

    public Registration(Student student) {
        this.registrationDate = new Date();
        this.student = student;
    }

    public void displayInfo() {
        System.out.println("Registration Date: " + registrationDate);
        student.displayInfo();
    }
}
