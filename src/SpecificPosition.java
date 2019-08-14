//Java program to insert an element (specific position) into an array.
import java.util.Arrays;

public class SpecificPosition {
    public static void main(String[]args){
        int []a ={10,20,30,40,50,60};
        int b =3;
        int c =15;
        System.out.println("Original Array value "+ Arrays.toString(a));

        for(int i =a.length -1; i>b; i--)
            a[i] =a[i-1];
        a[b]=c;
        System.out.println("New Array" + " "+ Arrays.toString(a));
    }

}
