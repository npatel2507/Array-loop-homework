import java.util.Scanner;

public class SpecificValue {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Array");
        int b = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("Value of array and position of index" + " " + i);
            }
        if(i!=b){

        }System.out.println("Invalid value of Array");
    }}
}