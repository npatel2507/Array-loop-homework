//

public class initCommonElements {
    public static void main (String[]args){
        String a[]= {"one","two","three","four","five"};
        String b[]= {"six","one","two","seven","eight"};

        for(int i =0; i<a.length; i++){
            for (int c =0; c<b.length; c++)
                if(a[i].equals(b[c]))

                    System.out.println(a[i]);

        }
    }
}
