import java.util.Scanner;
public class Q10_cm_in_feet{
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		System.out.print("Give height: ");
		int height= sc.nextInt();
		double inches=height/2.54;
		double feet = inches/12;
		System.out.print("Your height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);

	}
}
