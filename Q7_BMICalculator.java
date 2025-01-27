import java.util.Scanner;

public class Q7_BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for weight and height
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double heightInCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);

        // Display the BMI value
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Determine the weight status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else if (bmi >= 40.0) {
            System.out.println("Status: Obese");
        }

    }
}