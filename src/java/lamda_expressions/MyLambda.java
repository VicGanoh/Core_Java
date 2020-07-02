package java.lamda_expressions;

@FunctionalInterface
interface Travel{
    void bookLoc();  //-> by default public abstract void bookloc();

}

/*class Cab implements Travel{
    public void bookloc(){
        System.out.println("Cab Booked.Will arrive soon.");
    }
        }*/

public class MyLambda {
    public static void main(String[] args) {
       //1.
       // Travel passenger = new Cab(); //polymorphic statement
        // passenger.bookLoc();

       // 2.
        //Anonymous class implementation
       /* Travel passenger = new Travel(){
            public void bookLoc(){
                System.out.println("Cab Booked.Will arrive soon.");
            }
        };
         passenger.bookLoc();*/

       //3.Using a lambda expression
       Travel travel = ()-> {
            System.out.println("Cab booked.Will arrive soon.");
        };

        travel.bookLoc();


    }
}
