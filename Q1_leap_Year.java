import java.util.Scanner;

public class Q1_leap_Year{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();


        if (year < 1582) {
            System.out.println("Invalid year. Leap Year calculation is not applicable before 1582.");
        } else if (year % 4 != 0) {
            System.out.println("Not a Leap Year.");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a Leap Year.");
        } else {
            System.out.println("Leap Year.");
        }



    }
}