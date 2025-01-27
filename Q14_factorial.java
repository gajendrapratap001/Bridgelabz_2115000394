import java.util.Scanner;
public class Q14_factorial{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int fac=1;
		while(num!=0){
			fac=fac*num;
			num--;
		}
		System.out.print(fac);
	}
}
			
