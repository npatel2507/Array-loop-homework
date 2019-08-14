import java.util.Scanner;

public class ArmstrongNumber {
    public static void main (String[]args) {
        //  Scanner scanner = new Scanner(System.in);
         // System.out.println("Enter any number to know its Armstrong number or not");
        int i = 1, a, arm, n, temp;
        while(i<500){
            n = i;
            arm = 0;
            while (n>0){
                a =n%10;
                arm = arm +(a* a *a);
                n = n/10;
            }if (arm ==i)
                System.out.printf("\n it is a Armstrong number : "+ (i));
            ++i; }
    }
}
