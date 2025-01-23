import java.util.Scanner;
public class L2_Q9_athlete {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();
        double peri= side1+ side2+side3;
        double rounds= 5000/peri;
        System.out.print("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");

    }

}
