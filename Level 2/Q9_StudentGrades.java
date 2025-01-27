import java.util.Scanner;

public class Q9_StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        double[][] marks = new double[number][3];  // [][0] = Physics, [][1] = Chemistry, [][2] = Maths
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            while (true) {
                System.out.print("Enter Physics marks (0-100): ");
                marks[i][0] = scanner.nextDouble();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid marks! Please enter valid marks between 0 and 100.");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter Chemistry marks (0-100): ");
                marks[i][1] = scanner.nextDouble();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid marks! Please enter valid marks between 0 and 100.");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter Maths marks (0-100): ");
                marks[i][2] = scanner.nextDouble();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid marks! Please enter valid marks between 0 and 100.");
                } else {
                    break;
                }
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        System.out.println("\nDetails of students:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }
    }
}
