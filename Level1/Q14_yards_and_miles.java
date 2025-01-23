import java.util.Scanner;
public class Q14_yards_and_miles {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("distance in feet: ");
        double feet= sc.nextDouble();
        double yard= feet/3;
        double miles= yard/1760;
        System.out.print("In miles: "+miles+" and in yard "+yard);

    }
}
