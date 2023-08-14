import java.util.Scanner;

public class Basic {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();

            int rev = 0, r;
            while(n>0){
                r = n%10;
                rev = rev*10+r;
                n/=10;
            }
            System.out.print("Reversed Number Is: " + rev);
        }
    }
}
