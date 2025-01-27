
import java.util.Scanner;

public class Q6_BMI_Calculator {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();

            bmis[i] = calculateBMI(weights[i], heights[i]);

            statuses[i] = determineStatus(bmis[i]);
        }

        System.out.println("\nResults:");
        System.out.printf("%-10s%-10s%-10s%-10s%-15s\n", "Person", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d%-10.2f%-10.2f%-10.2f%-15s\n",
                    i + 1,
                    weights[i],
                    heights[i],
                    bmis[i],
                    statuses[i]);
        }
    }
}