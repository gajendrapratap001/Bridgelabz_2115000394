import java.util.Scanner;
public class L2_Q2_intoperation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d1= a+b*c;
        int d2= a*b+c;
        int d3= c+a/b;
        int d4= a%b+c;
        System.out.print("The results of Int operations are "+d1+","+d2+","+d3+" and "+d4);

    }
}
