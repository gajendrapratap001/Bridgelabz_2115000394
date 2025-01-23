import java.util.Scanner;

public class L2_Q8_IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for name and city details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your city of origin: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

        // Take user input for distances
        System.out.print("Enter the distance from origin to via city (in miles): ");
        int fromToVia = scanner.nextInt();

        System.out.print("Enter the distance from via city to destination (in miles): ");
        int viaToFinalCity = scanner.nextInt();

        // Take user input for time taken
        System.out.print("Enter the time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Perform the operations
        int totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken; // Division has higher precedence

        // Print the results
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");

        // Close the scanner
        scanner.close();
    }
}
