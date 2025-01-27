import java.util.Scanner;
public class Q11_sumofNums_untilNeg{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double userInput= sc.nextDouble();
		double total=0.0;
		while(true){
			if(userInput<=0){
				break;
			}
			total+= userInput;
			userInput=sc.nextDouble();
		}
		System.out.println(total);
	}
}
