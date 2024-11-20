package Problem_one;

public class CollegeStudent extends Student {
    private String major; // Major of the College Student
    private int year;     // Current year in college (1 = Freshman, etc.)

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Initialize Student attributes
        this.year = year;
        this.major = major;
    }

    // Getters
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    // Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString method
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}

