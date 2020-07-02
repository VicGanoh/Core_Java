package inheritance;

//using run-time polymorphism
public class Figure  {
   protected double dim1;
   protected double dim2;
   private String color;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    public double getDim1(){
     return dim1;
    }

    public void setDim1(double dim1){
        this.dim1 = dim1;
    }

    public double getDim2(){
        return dim2;
    }

    public void setDim2(double dim2){
        this.dim2 = dim2;
    }

    double area(){
        System.out.println("Area for Figure is undefined. ");
        return 0;
    }
}
