public class TransposeMatrix {
    public static void main(String[]args){
        int i;
        int j;

        int [][]matrix = {{10,15,20}, {25,30,35},{40,45,50}};
        for(i =0; i<3;i++){
            for(j = 0; j<3; j++)
                System.out.print( matrix [i][j]);
        System.out.println("    ");}
    }
}
