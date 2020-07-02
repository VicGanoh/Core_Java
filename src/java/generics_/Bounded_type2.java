package java.lamda_expressions.Generics_;

public class Bounded_type2 {
     public static <T extends Comparable<T>> T maximum(T x, T y, T z){
     T max = x; //assume x is the maximum initially
     if (y.compareTo(max) > 0) {
        max = y;  //y is the largest so far
     }
     if(z.compareTo(max) > 0) {
            max = z; //x is the largest so far
         }

     return max; //returns the maximum amongst all
    }

    public static void main(String[] args) {
        System.out.println("Maximum among first entry: " +  maximum(0,2,3));
        System.out.println("Maximum among second entry: " +  maximum(9.4,2.54,3.6));
        System.out.println("Maximum among third entry: " +  maximum("Apple","Orange","Kola"));



    }
}
