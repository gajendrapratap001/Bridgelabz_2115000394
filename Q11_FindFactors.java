import java.util.Scanner;

public class Q11_FindFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + ":");

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(number); // Print the number itself as it's always a factor

        scanner.close();
    }
}