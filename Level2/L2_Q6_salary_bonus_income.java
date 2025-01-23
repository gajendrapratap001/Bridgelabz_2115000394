import java.util.Scanner;
public class L2_Q6_salary_bonus_income {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Salary: ");
        int salary= sc.nextInt();
        System.out.print("Bonus: ");
        int bonus=sc.nextInt();
        int total_Income= salary+bonus;
        System.out.print("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence total income is INR "+total_Income);

    }
}
