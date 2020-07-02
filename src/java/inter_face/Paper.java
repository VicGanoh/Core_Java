package java.lamda_expressions.inter_face;



public class Paper extends Book implements Product {
     protected String  paper_shape;
     String color;

    public Paper(String paper_no){
        System.out.println("Paper no: " + paper_no);
  }

     //method overloading from parent class (Book)
    public void BookShape(String paper_shape){
       super.BookShape();
        System.out.println("Paper shape: "+paper_shape );
    }

    @Override
    public void setColor(String color) {
        this.color =color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
