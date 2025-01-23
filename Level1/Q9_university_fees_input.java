import java.util.Scanner;
public class Q9_university_fees_input {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("University fees: ");
        int fees= sc.nextInt();
        System.out.print("discount percentage: ");
        int discountPercent= sc.nextInt();
        int discount = (fees * discountPercent)/100;
        int newFees= fees- discount;
        System.out.println("The discoint amount is INR "+discount+" and final discounted fess is INR " +newFees);


    }
}
