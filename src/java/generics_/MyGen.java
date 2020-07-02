package java.lamda_expressions.Generics_;

public class MyGen <V>{
    V obj;
    MyGen(V ob){
        obj = ob;
    }

    public void displayValue(){
        System.out.println("The value/text is : " + obj);
    }

}
