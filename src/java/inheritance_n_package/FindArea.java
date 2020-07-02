package inheritance;


public class FindArea extends inheritance.util.SubPackage{
    public static void main(String[] args) {

       //inheriting from a subpackage
        inheritance.util.SubPackage s = new inheritance.util.SubPackage(5);



        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
        
        java.lamda_expressions.Inheritance_assignment.Birthday_Cake object = new java.lamda_expressions.Inheritance_assignment.Birthday_Cake();
        object.setFlavor("Orange");
        System.out.println("Flavour of cake: " + object.getFlavor());
    }
}
