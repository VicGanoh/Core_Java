package java.lamda_expressions.inter_face;

public class Customer {

    public static void main(String[]args){
       //book is an object of PRODUCT but referenced variable to the Book class
        Product book = new Book();
        book.setName("Java in a Nutshell");
        book.setPrice(45.00);

        System.out.println("Name of Book: " +book.getName());
        System.out.print("Price: $ "+ book.getPrice());
        System.out.println(" ");
        System.out.println("------------");

        Product sheet1 = new Paper("121FA");
        //casting paper
        ((Paper)sheet1).BookShape("Square");
    }
}
