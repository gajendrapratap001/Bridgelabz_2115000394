import java.util.Scanner;
public class L2_Q3_DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter value for a: ");
        a = scanner.nextDouble();
        System.out.print("Enter value for b: ");
        b = scanner.nextDouble();
        System.out.print("Enter value for c: ");
        c = scanner.nextDouble();
        double result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c; // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b; // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c; // Modulus (%) has higher precedence than addition (+)
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
        scanner.close();
    }
}