//Display right angle triangle of @
        import java.util.Scanner;

public class Triangle {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size you want");
        int a = scanner.nextInt();
        for(int i=1;i<=a;i++){

            for(int j=1;j<=a;j++){
                if(j<=i)
                System.out.print("@");
            }System.out.println();
        }


    }
}
