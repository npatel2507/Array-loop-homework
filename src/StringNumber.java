import java.util.Scanner;

public class StringNumber {

    public static void  main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int a = scanner.nextInt();
        String arr[] = new String[a];
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Enter the name");
            String name = scanner.next();
            for (int j = 0; j < arr.length; j++)
                if (name.charAt(j) == 'a') {
                    System.out.println("Total  a  ");
                    count++;
                }
        }  System.out.println("Letter : " + count);
}}
