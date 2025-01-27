import java.util.Scanner;

public class Q8_StudentGrades {

    public static double getPositiveInput(Scanner sc, String subject) {
        double marks;
        while (true) {
            System.out.print("Enter marks for " + subject + ": ");
            marks = sc.nextDouble();
            if (marks < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
            } else {
                break;
            }
        }
        return marks;
    }

    public static String[] calculateGrade(double percentage) {
        String[] gradeRemark = new String[2];

        if (percentage >= 80) {
            gradeRemark[0] = "A";
            gradeRemark[1] = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            gradeRemark[0] = "B";
            gradeRemark[1] = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            gradeRemark[0] = "C";
            gradeRemark[1] = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            gradeRemark[0] = "D";
            gradeRemark[1] = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            gradeRemark[0] = "E";
            gradeRemark[1] = "Level 1-, too below agency-normalized standards";
        } else {
            gradeRemark[0] = "R";
            gradeRemark[1] = "Remedial standards";
        }

        return gradeRemark;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        double[] marksPhysics = new double[numStudents];
        double[] marksChemistry = new double[numStudents];
        double[] marksMaths = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];
        String[] remarks = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");


            marksPhysics[i] = getPositiveInput(sc, "Physics");
            marksChemistry[i] = getPositiveInput(sc, "Chemistry");
            marksMaths[i] = getPositiveInput(sc, "Maths");

            double totalMarks = marksPhysics[i] + marksChemistry[i] + marksMaths[i];
            percentages[i] = (totalMarks / 300) * 100;

            String[] gradeRemark = calculateGrade(percentages[i]);
            grades[i] = gradeRemark[0];
            remarks[i] = gradeRemark[1];
        }

        System.out.println("\nResults:");
        System.out.printf("%-10s%-10s%-10s%-10s%-15s%-10s%s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Remarks");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d%-10.1f%-10.1f%-10.1f%-15.2f%-10s%s\n",
                    i + 1,
                    marksPhysics[i],
                    marksChemistry[i],
                    marksMaths[i],
                    percentages[i],
                    grades[i],
                    remarks[i]);
        }

    }
}