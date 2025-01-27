import java.util.Scanner;
public class Q15_factorial_for{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int fac=1;
        for(int i=num;i>0;i--){
            fac*=i;

        }
        System.out.print(fac);
    }
}

