package java.lamda_expressions.Generics_;

public class GenMain {
    public static void main(String[] args) {
        MyGen<String> obj1 = new MyGen<String>("Tokyo");
        MyGen<Integer>obj2 = new MyGen<Integer>(56);
        MyGen<Character>obj3 = new MyGen<Character>('C');
        obj1.displayValue();
        obj2.displayValue();
        obj3.displayValue();
    }
}
