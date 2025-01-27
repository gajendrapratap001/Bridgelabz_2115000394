import java.util.Scanner;

public class Q4_ArrayInputSum {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                break;
            }

            if (index >= 10) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }


        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n\nTotal of entered numbers: " + total);

    }
}
