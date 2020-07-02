package java.lamda_expressions.inter_face;
//Book class is declared abstract since it doesn't implement all methods of Product interface
 public class Book implements Product {

     private double price;
     private String name;
     private String color;
     private String author;
     private int pages;
     protected String isbn;

     public void BookShape() {
         System.out.println("Book shape: Rectangle");
     }

     @Override
     public double getPrice() {
         return price;
     }

     @Override
     public void setPrice(double price) {
         this.price = price;
     }

     @Override
     public String getName() {
         return name;
     }

     @Override
     public void setName(String name) {
         this.name = name;
     }

     @Override
     public String getColor() {
         return color;
     }

     @Override
     public void setColor(String color) {
         this.color = color;
     }



     public String getAuthor() {
         return author;
     }

     public void setAuthor() {
         this.author = author;
     }

     public int getPages() {
         return pages;
     }

     public void setPages(int pages) {
         this.pages = pages;
     }

     public String getIsbn() {
         return isbn;
     }

     public void setIsbn(String isbn) {
         this.isbn = isbn;
     }

     @Override
     public void Product_ID(String product_id) {
         product_id = "367ED";
         System.out.println(product_id);
     }
 }


