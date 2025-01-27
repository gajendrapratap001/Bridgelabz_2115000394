import java.util.Scanner;

public class Q3_GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();

        int totalMarks = physics + chemistry + maths;
        double averageMark = (double) totalMarks / 3;
        double percentage = (double) totalMarks / (3 * 100) * 100;

        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'R';
        }

        System.out.println("Average Mark: " + averageMark);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: ");
        switch (grade) {
            case 'A':
                System.out.println("Level 4, above agency-normalized standards");
                break;
            case 'B':
                System.out.println("Level 3, at agency-normalized standards");
                break;
            case 'C':
                System.out.println("Level 2, below, but approaching agency-normalized standards");
                break;
            case 'D':
                System.out.println("Level 1, well below agency-normalized standards");
                break;
            case 'E':
                System.out.println("Level 1-, too below agency-normalized standards");
                break;
            default:
                System.out.println("Remedial standards");
        }
    }
}
