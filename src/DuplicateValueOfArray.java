public class DuplicateValueOfArray {
            public static void main(String[]args){
                int a[]={23,56,78,23,67,56};
                for(int i =0; i<a.length;i++)
                    for(int j=0; j<a.length; j++)
                        if((a[i]==a[j]) && (i !=j)){

                            System.out.println("Duplicate elements :"+ " "+ a[j]);

            }}

}