import java.util.Scanner;
public class Q2_smallestNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        if(n1<n2 && n1<n3){
            System.out.print("Is the first number the smallest? Yes");
        }
        else{
            System.out.print("Is the first number the smallest? No");

        }
    }
}
