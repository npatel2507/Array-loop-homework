//print the numbers between 1 to 100 which can be divided by 3 and 5 separately
import java.util.Scanner;

public class Division {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 100 which is devided by 3");
        int i = scanner.nextInt();

        for(i=1; i<=100;i++){
         if(i%3==0){
            System.out.println(i);}}
         System.out.println("\n\n Enter any number between 1 to 100 which is devided by 5");
        i = scanner.nextInt();
        for(i=1; i<=100;i++)
        if(i%5==0){
            System.out.println(i);
        }

        }
    }



