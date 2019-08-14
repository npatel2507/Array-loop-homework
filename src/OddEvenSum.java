//14.	WAP to input any five digit number then count total no of odd and even digit and find sum of them


import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        int n =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any number");
        n = scanner.nextInt();
        System.out.println("Enter any number");
        n = scanner.nextInt();

        int i;
        int sum = 0;
        int sum1 = 0;
        for (i = 1; i < n; i++) {
        }
        if (i % 2 == 0) {
           sum = sum + i;
        } else {
           sum1 = sum1 + i;
        }
        System.out.println("sum of even number = \n" + sum);
        System.out.println("sum of odd number =\n" + sum1);
    }
}