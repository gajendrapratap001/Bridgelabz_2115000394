import java.util.Scanner;
public class Q13_natural_for{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sol;
        int sum=0;
        if(n>0){
            sol=n*(n+1)/2;
            for(int i=n;i>=1;i--){
                sum+=i;

            }
            System.out.println("By formula: "+sol);
            System.out.println("By for loop: "+sum);
        }
    }
}



