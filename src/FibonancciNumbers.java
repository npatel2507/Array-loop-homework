//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n

import java.util.Scanner;
public class FibonancciNumbers {
   public static void main(String[]args){
       int b=0,c=1,x;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter how many fibonanci number you want");
       int a = scanner.nextInt();
       System.out.print(b+" "+c);

       for(int i=2;i<a;++i)
       {
           x=b+c;
           System.out.print(" "+x);
           b=c;
           c=x;
       }

   }}




