import java.util.Scanner;
public class Q18_multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int var= sc.nextInt();
        if(var>=6 && var<=9){
            for(int i=1;i<=10;i++){
                int sol=var*i;
                System.out.println(var+"*"+i+"="+sol);
            }
        }
    }
}
