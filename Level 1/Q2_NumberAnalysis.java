import java.util.Scanner;

public class Q2_NumberAnalysis {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element is equal to the last element.");
        }

    }
}
