import java.util.Scanner;

public class NumberOfWordsAndSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the Name : ");
        String name = scanner.nextLine();
        int word = 1;
        for (int i = 0; i<name.length(); i++) {
            if (name.charAt(i) == ' ')
                word++;}
        System.out.println( "Total word"  +  word);
        System.out.println(" Total Space in between the Words" + (word-1));
}}
