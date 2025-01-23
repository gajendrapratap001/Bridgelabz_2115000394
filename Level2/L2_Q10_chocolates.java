import java.util.Scanner;
public class L2_Q10_chocolates {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double numberOfchocolates= sc.nextInt();
        double numberOfChildren = sc.nextInt();
        double chocolateDivided= numberOfchocolates/numberOfChildren;
        double remainChocolates= numberOfchocolates%numberOfChildren;
        System.out.print("The number of chocolates each child gets is "+chocolateDivided+" and the number of remaining chocolates are "+remainChocolates);

    }
}
