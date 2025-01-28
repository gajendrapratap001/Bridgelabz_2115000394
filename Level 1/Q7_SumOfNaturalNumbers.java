import java.util.Scanner;

public class Q7_SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = sumOfNaturalNumbers(n);

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
