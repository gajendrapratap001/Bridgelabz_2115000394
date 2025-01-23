import java.util.Scanner;
public class L2_Q1_quotient_and_remainder {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double num1= sc.nextDouble();
        double num2= sc.nextDouble();
        double q= num1/num2;
        double r= num1%num2;
        System.out.print("The quotient is "+q+ " and remainder is "+r+" of two number "+num1+" and "+num2);

    }

}
