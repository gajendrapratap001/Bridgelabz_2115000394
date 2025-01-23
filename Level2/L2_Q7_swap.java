import java.util.Scanner;
public class L2_Q7_swap {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int temp;
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("num1 is: "+num1);
        System.out.println("num2 is: "+num2);
        temp= num1;
        num1=num2;
        num2=temp;
        System.out.println("num1 is: "+num1);
        System.out.println("num2 is: "+num2);
    }
}

