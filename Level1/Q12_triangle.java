import java.util.Scanner;
public class Q12_triangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Triangle base: ");
        int base= sc.nextInt();
        System.out.print("Triangle height: ");
        int height= sc.nextInt();
        int area= (base*height)/2;
        System.out.print("Area of triangle is: "+area);

    }
}
