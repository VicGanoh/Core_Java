package java.lamda_expressions;

@FunctionalInterface
interface Calculation{
    void add(int num1, int num2);
}

@FunctionalInterface
interface Messenger{
    void getMessage(String msg);
}

class Message {

    public Message(String msg) {
        System.out.println("Message: " + msg);
    }

}

class Calc{

    public static void addSomething(int num1, int num2){
        System.out.println(num1+" and "+num2+" addition is: "+(num1 + num2));
    }

    public void addThis(int num1,int num2){
        System.out.println(num1+" and "+num2+" adds to: "+(num1 + num2));
    }
}

public class LambdaMethodReferencing {
    public static void main(String[] args) {
        //Calc.addSomething(5,4);
        //1.Reference to static method
        //for static method the classname is used as reference
        Calculation ref = Calc::addSomething; //Method reference
        ref.add(5,4);

        //2.Reference to instance method/non-static method
        //for instance method an object reference is used
        Calc calc = new Calc();
        Calculation iRef = calc::addThis;
        iRef.add(12,4);

        //3. Constructor Referencing
        //classname::new
       Messenger conRef = Message::new;
       conRef.getMessage("Hello this is a reference constructor.");

    }
}
