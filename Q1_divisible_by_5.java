import java.util.Scanner;
public class Q1_divisible_by_5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Give a number: ");
        int num= sc.nextInt();
        if(num%5==0){
            System.out.print("Is the number "+num+ " divisible by 5? Yes");
        }
        else{
            System.out.print("Is the number "+num+ " divisible by 5? No");
        }
    }
}
