import java.util.Scanner;
public class Q13_Square_side {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Perimeter of square is: ");
        double peri= sc.nextInt();
        double side= peri/4;
        System.out.print("The length of the side is "+side+" whose perimeter is "+peri);


    }
}
