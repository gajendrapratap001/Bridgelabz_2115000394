import java.util.Scanner;
public class Q8_km_to_miles_input{
	public static void main(String[] args){
		Scanner input= new Scanner (System.in);
		System.out.print("Give km to be converted in miles: ");
		double km =input.nextDouble();
		double miles=km/1.6;
		System.out.print("the total miles is "+miles+" mile for the given "+km+" km");

	}
}
