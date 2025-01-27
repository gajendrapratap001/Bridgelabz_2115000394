import java.util.Scanner;

public class Q3_HarshadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of digits
        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
