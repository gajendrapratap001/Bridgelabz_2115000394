import java.util.Scanner;

public class Q1_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber, remainder, sum = 0;
        originalNumber = number;

        // While loop to extract digits and calculate sum of cubes
        while (originalNumber != 0) {
            remainder = originalNumber % 10; // Find the last digit
            sum += Math.pow(remainder, 3); // Calculate cube and add to sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the number is Armstrong
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}