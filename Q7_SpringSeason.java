import java.util.Scanner;
public class Q7_SpringSeason{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Month: ");
		int month= sc.nextInt();

		System.out.print("Day: ");
		int day= sc.nextInt();


		if(month==3 && day>=20 && day<31){
			System.out.println("Spring Season");
		}
		if(month>=4 && month<=5 && day>=1 && day<=31){
			System.out.println("Spring Season");
		}
		if(month==6 && day>=1 && day<20){
                        System.out.println("Spring Season");
                }
		else{
			System.out.println("Not a Spring Season");
		}
	}
}


