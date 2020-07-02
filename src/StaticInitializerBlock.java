
import java.util.Scanner;
public class StaticInitializerBlock {
    static {
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt(); //breadth
        int height = sc.nextInt(); //height
        int area_of_parallelogram = breadth * height;
        boolean flag = true;

        if (breadth<=0 || height<=0){
            System.out.println("java.lang.Exception: Breadth and Height must be positive");
        }
        if ((breadth>0 && breadth<=100) && (height>= 0  && breadth<=100))
            System.out.println(area_of_parallelogram);



    }

    public static void main(String[] args) {

    }
}
