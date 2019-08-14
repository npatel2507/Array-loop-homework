import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit you want to reverse");
        int a =scanner.nextInt();
        int b;
        int c=0;
        while(a!=0){
                   b=a%10;
                   c=c*10+b;
                   a=a/10;
        }System.out.println(c);
    }
}
