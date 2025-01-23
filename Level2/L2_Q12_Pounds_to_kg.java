import java.util.Scanner;
public class L2_Q12_Pounds_to_kg {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        double kg=p/2.2;
        System.out.print("The weight of the person in pound is "+p+" and in kg is "+kg);
    }
}
