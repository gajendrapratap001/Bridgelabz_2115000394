import java.util.Scanner;
public class Q15_Total_price {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("unitPrice: ");
        int unitPrice= sc.nextInt();
        System.out.print("quantity: ");
        int quantity= sc.nextInt();
        int total_Price= unitPrice*quantity;
        System.out.print("The total purchase price is INR "+total_Price+" if the quantity is "+quantity+" and the unit price is INR "+unitPrice);
    }
}
