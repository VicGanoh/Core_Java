import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no_of_input=sc.nextInt();

        for(int i=0;i<no_of_input;i++)
        {

            try
            {
                long x=sc.nextLong();

                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if (x>=(int)(Math.pow(-2,15)) && x<=(int)Math.pow(2,15)-1){
                    System.out.println("* short");
                    // System.out.println("* int");
                    // System.out.println("* long");
                }
                if (x>=(int)Math.pow(-2,31) && x<=(int)Math.pow(2,31)-1) System.out.println("* int");
                if(x>=(long)Math.pow(-2,63) && x<=(long)Math.pow(2,63) - 1) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }


        }
    }
}
