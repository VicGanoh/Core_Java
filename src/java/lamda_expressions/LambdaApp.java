package java.lamda_expressions;

@FunctionalInterface
interface Factorial{
    int calc(int num);
}

public class LambdaApp {
    public static void main(String[] args) {

        Factorial fact = (num)->{
            int factorial = 1;
            for (int i=1;i<=num;i++){
                 factorial *= i;
            }
            return factorial;
        };


        System.out.println("Factorial of 4 is: "+ fact.calc(4));
        System.out.println("Factorial of 5 is: "+ fact.calc(5));
    }
}
