package java.lamda_expressions.nested_interface;

 class A {
    //nested interface
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF{
    @Override
    public boolean isNotNegative(int x){
        return x < 0 ? false: true;
    }
}



public class Test {
    public static void main(String args[]) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("10 is not negative");
        if (nif.isNotNegative(-12))
            System.out.println("This will not be displayed.");
    }

}



