import java.util.Scanner;

//18 Printing multiplication table using do while loop
public class MultiplicationTable {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter upto which you want to print multiplication table of");
        int n = scanner.nextInt();
        System.out.println("Please enter upto where you want to multiply to");
        int t = scanner.nextInt();
        int i = 1;
        int k = 1;
        do {
            do {
                System.out.println((k * i) + " ");
                k++;
            } while (k<=t);
            k=1;

                    }while(i<=n);
             }
            }