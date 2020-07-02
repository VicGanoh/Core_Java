package java.lamda_expressions.inter_face;

//default modifier for an interface cannot be accessed from outside package

  interface Product {

   default void  Product_ID(String product_id){};

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

  /*
    default String getProduct_ID(){
    return "no product ID";
    }*/
}
