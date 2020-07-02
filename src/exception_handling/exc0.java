package exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exc0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int result;
        try {
            System.out.println("Enter a whole number: ");
            num = input.nextInt();
            result = num/ 0;
            System.out.println(result);
        }catch(InputMismatchException | ArithmeticException e){
            //System.out.println("Number you entered is not a whole number"); //can be in the manual format or the other commented format
           System.out.println("Exception: " + e);
        }/*catch(ArithmeticException e){
            System.out.println("Division by zero error.");
            System.out.println("Exception: " + e);
            
        }*/

    }
}
