//Java program to reverse an array of integer values
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[]args){
        int []a ={12,34,24,45,47,67,89};
        System.out.println("Original Arrays = "+Arrays.toString(a));
        for(int i = 0; i < a.length / 2; i++)
        {
            int b = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = b;
        }
        System.out.println("Reverse array = "+Arrays.toString(a));
    }
}
