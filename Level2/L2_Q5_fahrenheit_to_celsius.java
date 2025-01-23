import java.util.Scanner;
public class L2_Q5_fahrenheit_to_celsius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give temp in fahrenheit: ");
        double fahrenheit=sc.nextDouble();
        double celsius=((fahrenheit-32)*5)/9;
        System.out.print("The "+fahrenheit+" fahrenheit is "+celsius+" celsius");


    }
}