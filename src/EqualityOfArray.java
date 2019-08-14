//Write a Java program to equality of test the two arrays
public class EqualityOfArray {
    public static void main(String[]args){
      int a[] ={10,20,30,40,50};
      int b[]={12,13,14,15,16};
      int c[]={10,20,30,40,50};

      boolean equalOrNot = true;
      if(a.length ==b.length){
          for(int i=0; i<a.length; i++)
              if(a[i]!=b[i]){
                  equalOrNot = false;}
              }else{equalOrNot = false;}
      if(equalOrNot){
          System.out.println("Array looks Equal");

      }else System.out.println("Array not equal");
         if (a.length ==c.length){
             for (int i = 0; i < a.length; i++) {
                 if (a[i]!=c[i]){
                     equalOrNot = true;}
                 else{equalOrNot = true; }
                 if(equalOrNot) {
                     System.out.println("Array looks Equal");
                 }else System.out.println("Arrays not Equal ");
             }
         }
    }
}


