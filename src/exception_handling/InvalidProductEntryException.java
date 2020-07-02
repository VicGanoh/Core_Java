package exception_handling;

import java.util.Scanner;

//creating a custom or a user-defined exception
public class InvalidProductEntryException extends Exception {
    private String str;
    public InvalidProductEntryException(String str_){
        super(str_);
       //this.str = str_;

    }
    /*//overriding the method from Exception class
    @Override
    public String toString(){
        return ("Exception : " + str);
    }*/

}


 class Main{
    static void ProductCheck() throws InvalidProductEntryException{
        double weight;

        System.out.println("Enter the weight of your product (kg): ");
        Scanner input = new Scanner(System.in);
        weight = input.nextDouble(); //assume valid weight of product is 100kg and above

        if (weight<100)
            throw new InvalidProductEntryException("Weight of product not valid.");
        else
            System.out.println("Product of weight "+weight+ " kg accepted.");
    }


    public static void main(String[] args) {
       Main obj = new Main();
        try{
            obj.ProductCheck();
        }
        catch(InvalidProductEntryException ex){
            System.out.println("Exception: " + ex.getMessage());
            //System.out.println(ex);
        }
    }
}