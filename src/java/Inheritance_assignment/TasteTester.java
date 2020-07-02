package java.lamda_expressions.Inheritance_assignment;

/*Cake cake cake !!!
create a superclass called Cake that has two fields:
flavor and price. Getter and setter methods should be created for these fields.
Create a BirthdayCake class which inherits from Cake and has a field called candles.Include getter and setter method.
Create a WeddingCake class which inherits from Cake and has a field called tiers. Include getter and setter method. Create a TasteTester class to test out your inheritance
 */

public class TasteTester {
    public static void main(String[] args) {
       Birthday_Cake cake_1 = new Birthday_Cake();
       cake_1.setCandles(5);
       cake_1.setFlavor("strawberry");
       cake_1.setPrice(20);
        System.out.println("The first birthday cake has " + cake_1.getCandles() + " candles with a "+ cake_1.getFlavor() + " flavor");
        System.out.println("Price in USD: " + cake_1.getPrice());
        System.out.println("-----------------------------------------------");


        Birthday_Cake cake_2 = new Birthday_Cake();
        cake_2.setCandles(3);
        cake_2.setFlavor("banana");
        cake_2.setPrice(19.55);
        System.out.println("The second birthday cake has " + cake_2.getCandles() + " candles with a "+ cake_2.getFlavor() + " flavor");
        System.out.println("Price in USD: " + cake_2.getPrice());
        System.out.println("-----------------------------------------------");


        Wedding_Cake wedcake1 = new Wedding_Cake();
        wedcake1.setTiers(4);
        wedcake1.setFlavor("pineapple");
        cake_2.setPrice(18.65);
        System.out.println("The wedding cake has " +wedcake1.getTiers() + " tiers with a "+ wedcake1.getFlavor() + " flavor");
        System.out.println("Price in USD: " + wedcake1.getPrice());
        System.out.println("-----------------------------------------------");
    }
}