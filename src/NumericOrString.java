//1.Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class NumericOrString {
    public static void main(String[]args){
        //int initialized
        int []num ={34,56,26,10,45};
        System.out.println("Original numeric array" + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted  numeric array" + Arrays.toString(num));

        //string initialized
        String []letter ={"one","two","three","four","five"};
        System.out.println("Original String array " + Arrays.toString(letter));
        Arrays.sort(letter);
        System.out.println("Sorted String array " + Arrays.toString(letter));
    }
}
