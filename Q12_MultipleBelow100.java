import java.util.Scanner;

public class Q12_MultipleBelow100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100:");

        for (int i = 1; i <= 99; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}