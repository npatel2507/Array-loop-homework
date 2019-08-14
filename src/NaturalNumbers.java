//Write a program in Java to display n limit of natural numbers and their sum.

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[]args){
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Natural number :");
        int a = scanner.nextInt();
        System.out.println("Input the number :"+a);

        for(int i =1; i<=a; i++){
            System.out.println(i);
          sum = sum+i;}
        System.out.println("total of natural number :" +sum);

    }
}
