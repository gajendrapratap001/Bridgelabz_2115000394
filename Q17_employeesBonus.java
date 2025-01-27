import java.util.Scanner;
public class Q17_employeesBonus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double salary= sc.nextDouble();
        int year= sc.nextInt();
        if(year>5){
            double bonus=(salary*5)/100;
            System.out.print("bonus is: "+bonus);
        }

    }
}
