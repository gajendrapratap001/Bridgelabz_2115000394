import java.util.Scanner;
public class Q10_sumofNumbers{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double b=sc.nextDouble();

		double total=0.0;

		while(b!=0){
			total=total+b;

			b=sc.nextDouble();
		}
		System.out.print(total);
	}
}
	
