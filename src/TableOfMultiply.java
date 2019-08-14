import java.util.Scanner;

public class TableOfMultiply {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number you want");
        int a =scanner.nextInt();


        for(int i =0; i<=5;i++){
            System.out.println(a +"*"+i+ "="+(a*i));
        }System.out.println();
    }
}
