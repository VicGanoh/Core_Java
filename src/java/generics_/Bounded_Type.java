package java.lamda_expressions.Generics_;

public class Bounded_Type<V extends Number> {
    V obj[];
    Bounded_Type(V ob[]){
        obj = ob;
    }

    public void displayText(){
        //System.out.println("Elements are: ");
        for(V element : obj){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intarray = {1, 2, 5, 4, 3};
        Double[] doublearray = {1.0, 6.0, 4.5, 2.5};
        Bounded_Type<Integer> numbers = new Bounded_Type<Integer>(intarray);
        Bounded_Type<Double> numbers_ = new Bounded_Type<Double>(doublearray);
        // Bounded_Type<String> str = new Bounded_Type<String>("String"); //This causes an error because only numbers are accepted

        System.out.println("Integer elements: ");
        numbers.displayText();
        System.out.println("Double elements: ");
        numbers_.displayText();
    }
}
