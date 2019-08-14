import java.util.Scanner;

public class IndexElement {
    public static void main(String[]args) {
        int c = 0;
        int[] a = {10, 20, 30, 40, 50, 60,70};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements from array");
        c = scanner.nextInt();

        for (int i = 0; i <= 5; ++i)
            if (c == a[i]) {

                System.out.println("The position of element " + c + " is at index " + i); }

           }
}
