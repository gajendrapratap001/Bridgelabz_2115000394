import java.util.Scanner;

public class Q2_HandshakeCalculator {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int handshakes = calculateHandshakes(n);

        System.out.println("The maximum number of handshakes is: " + handshakes);

    }
}

