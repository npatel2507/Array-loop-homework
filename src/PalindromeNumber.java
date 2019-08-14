//17.input any number and check if it is Palindrome or not
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();
        int sum = 0, r;
        int t = n;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(t==sum)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a Palindrome number.");
    }
}
