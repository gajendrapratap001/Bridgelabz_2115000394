import java.util.Scanner;
public class Q16_handshakes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of Students: ");
        int students= sc.nextInt();
        int handshakes=(students*(students-1))/2;
        System.out.print("Possible handshakes is: "+handshakes);
    }
}
