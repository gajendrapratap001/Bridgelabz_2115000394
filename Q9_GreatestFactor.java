import java.util.Scanner;

public class Q9_GreatestFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int greatestFactor = 1;

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop once a factor is found
            }
        }

        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);

        scanner.close();
    }
}