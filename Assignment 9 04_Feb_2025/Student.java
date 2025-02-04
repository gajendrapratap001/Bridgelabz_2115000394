public class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "A");
        Student s2 = new Student(102, "Bob", "B");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();

        s1.updateGrade("A+");
        s1.displayStudentDetails();
    }
}
