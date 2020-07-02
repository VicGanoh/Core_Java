package java.lamda_expressions;

@FunctionalInterface
interface Test<T>{
    T func(T var_); //generic types can be applied to functional interface making code reuse in lambda exp. simple and easy
}

public class Generic_functional_Interface {
    public static void main(String[] args) {
        //Using lambda expression for type String
        Test<String> travel = (str)->{return str;};
        System.out.println(travel.func("Cab booked.Will arrive soon."));

        //Using the same generic functional interface for type Integer
        Test<Integer> fact = (num) ->{
            int factorial = 1;
            for (int i = 1; i<=num; i++){factorial *= i;}
            return factorial;
        };
        System.out.println("Factorial of 4: "+fact.func(4));
        System.out.println("Factorial of 5: "+fact.func(5));

    }
}
