import java.util.*;
public class Q5_voteAge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.print("The person's age is "+age+ " and can vote");

        }
        else{
            System.out.print("The person's age is "+age+ " and cannot vote");
        }
    }
}
