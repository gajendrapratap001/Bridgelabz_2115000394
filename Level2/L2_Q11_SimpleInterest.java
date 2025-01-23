import java.util.Scanner;
public class L2_Q11_SimpleInterest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int si=(p*r*t)/100;
        System.out.print("The Simple Interest is "+si+" for Principal "+p+", Rate of Interest "+r+ " and Time "+t);


    }
}
