package exception_handling;

public class Throw_ {
    //applying the throws exception to methods
    static void throwOne()throws ArithmeticException{
        System.out.println("Inside the throwOne method");
        //throw exception
        throw new ArithmeticException("Arithmetic demo");
    }
    public static void main(String[] args) {

      //calling and catching the method
        try{
            throwOne();
        }catch(ArithmeticException e){
            System.out.println("Exception caught: " + e.getMessage()); //or
            System.out.println("Exception caught: " + e); //without the getMessage() method of Throwable
        }
        finally{
            //this is executed after the try and catch block no matter what
            System.out.println("throwOne's Finally");
        }
    }
}
