import java.util.Scanner;
public class Q12_natural_while{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sol;
		int sum=0;
		if(n>0){
			sol=n*(n+1)/2;
			while(n!=0){
				sum+=n;
				n--;
			}
			System.out.println("By formula: "+sol);
			System.out.println("By while loop: "+sum);
		}
	}
}

				
		
