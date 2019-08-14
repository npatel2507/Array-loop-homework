//2.Java program to sum values of an array.
import java.util.Scanner;

public class SumValueOfArray {
    public static void main(String []args){
     int n,sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements of an Array");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all elements");
        for(int i = 0; i < n; i++)
        {a[i]=scanner.nextInt();
        sum =sum +a[i];
        }System.out.println("sum::"+sum);
    }
}
