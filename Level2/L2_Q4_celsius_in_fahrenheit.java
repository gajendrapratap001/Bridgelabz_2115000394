import java.util.Scanner;
public class L2_Q4_celsius_in_fahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give temp in celsius: ");
        double celsius=sc.nextDouble();
        double fahrenheit=((celsius*9)/5)+32;
        System.out.print("The "+celsius+" celsius is "+fahrenheit+" fahrenheit");


    }
}
