import java.util.Scanner;
public class Q11_calculator{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int add = num1+num2;
		int sub= num1- num2;
		int multi= num1*num2;
		int div= (num1/num2);
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+","+sub+","+multi+" and "+div);
	}
} 
