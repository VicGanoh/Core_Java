package java.lamda_expressions;

@FunctionalInterface
interface arrayTest{
    void myarray(double arr[]) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Empty Array");
    }
}
public class LambdaExceptions {
    public static void main(String[] args) throws EmptyArrayException {
       // double values[] = {2.0,3.0,5.0,3.0,6.0};
        //assume values is empty it throws an exception
        double values[]= {};

        arrayTest calc = (arr) ->{
            double sum =0 ;
            double average;
            if (values.length == 0)
                throw new EmptyArrayException();
            for(double element : values){
                sum += element;
            }
            average = sum / (values.length);
            System.out.println("Average for values: " + average);
        };

        try {
            calc.myarray(values);
        }
        catch(EmptyArrayException e){
            System.out.println("Exception: " + e.getMessage());
        }



    }
}
