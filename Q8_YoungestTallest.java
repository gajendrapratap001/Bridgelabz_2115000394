import java.util.Scanner;

public class Q8_YoungestTallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get ages and heights of the friends
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = scanner.nextInt();

        // Find the youngest friend
        String youngest = "Amar";
        int youngestAge = amarAge;

        if (akbarAge < youngestAge) {
            youngest = "Akbar";
            youngestAge = akbarAge;
        }

        if (anthonyAge < youngestAge) {
            youngest = "Anthony";
            youngestAge = anthonyAge;
        }

        // Find the tallest friend
        String tallest = "Amar";
        int tallestHeight = amarHeight;

        if (akbarHeight > tallestHeight) {
            tallest = "Akbar";
            tallestHeight = akbarHeight;
        }

        if (anthonyHeight > tallestHeight) {
            tallest = "Anthony";
            tallestHeight = anthonyHeight;
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);


    }
}
