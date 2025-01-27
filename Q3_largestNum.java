import java.util.Scanner;
public class Q3_largestNum {
    public static void main(String[] java){
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2 && n1>n2){
            System.out.println("Is the first number the largest? Yes");
        }
        else{
            System.out.println("Is the first number the largest? No");
        }

        if(n2>n1 && n2>n3){
            System.out.println("Is the second number the largest? Yes");
        }
        else{
            System.out.println("Is the second number the largest? No");
        }

        if(n3>n1 && n3>n2){
            System.out.println("Is the third number the largest? Yes");
        }
        else{
            System.out.println("Is the third number the largest? No");
        }
    }
}
