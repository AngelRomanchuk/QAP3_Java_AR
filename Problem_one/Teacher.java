package Problem_one;

public class Teacher extends Person {
    private String subject; // Subject taught by the teacher
    private double salary;  // Teacher's annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Initialize Person attributes
        this.subject = subject;
        this.salary = salary;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}

