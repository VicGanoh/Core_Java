package stream_api.chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static stream_api.chap01.FilteringApples.Color.*;

public class FilteringApples {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, GREEN),
                new Apple(155, GREEN),
                new Apple(120, Color.RED)
        );

        //filters and print all green apples
        List<Apple> greenApples = filterApplesByColors(inventory, GREEN);
        List<Apple> redApples = filterApplesByColors(inventory, RED);
        System.out.println("List of Green Apples Only: ");
        System.out.println(greenApples);
        System.out.println("================================================");

        //filters and print all red apples
        System.out.println("List of Red Apples Only: ");
        System.out.println(redApples);
        System.out.println("================================================");

        //ALTERNATIVE
        //green apples only
        List<Apple> greenApples2 = filter(inventory,new AppleColorPredicate());
        System.out.println("Green Apples");
        System.out.println(greenApples);

        //filter and prints all which are heavy than 150g
        System.out.println("List of Apples wih weight greater than 150...");
        List<Apple> heavyApples = filterAppleByWeight(inventory, 150);
        System.out.println(heavyApples);

        //now we want to filter and get only red and heavy apples greater than 150
        System.out.println("================================================");
        List<Apple> redAndHeavyApples = filter(inventory, new AppleRedAndHeavyPredicate());
        System.out.println("List of Red and Heavy apples only: ");
        System.out.println(redAndHeavyApples); //empty list []

        //filter and get red apples using an ANONYMOUS CLASS to parameterize a behavior of a method
        List<Apple> redApples2 = filter(inventory, new ApplePredicate(){
            @Override
            public boolean test(Apple apple){
              return apple.getColor().equals(RED);
            }
        });
        System.out.println("Red Apples Only: ");
        System.out.println(redApples2);

    }



    //filtering green apples
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getColor().equals(GREEN)){  //select only green apples
                result.add(apple);
            }
        }
        return result;
    }

    //assuming farmer wants to get only multiple colors of apple...we can do something
    public static List<Apple> filterApplesByColors(List<Apple> inventory, Color color){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }

    //filter and get all heavy apples
    public static List<Apple> filterAppleByWeight(List<Apple> inventory, int weight){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if (apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }



    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple){
        return  apple.getWeight() > 150;
    }

   //Color enum to represent different colors of apple
    enum Color{
       RED,GREEN
    }

    public static class Apple {

        private int weight = 0;
        private Color color;

        public Apple(int weight, Color color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color='%s', weight='%d'}", color, weight);
        }
    }


    //interface predicate (Interface to test for apple)
    @FunctionalInterface
       interface ApplePredicate{
            boolean test (Apple a);
       }

       //this class selects only heavy apples
        static class  AppleWeightPredicate implements ApplePredicate{
           @Override
           public boolean test(Apple apple) {
               //select only heavy apples
               return apple.getWeight() > 150;
           }
       }

       //this class only test for the color of an apple
        static class AppleColorPredicate implements ApplePredicate{
           @Override
           public boolean test(Apple apple) {
               return (apple.getColor()).equals(GREEN); //select only green apples
           }
       }

//        public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
//            List<Apple> result = new ArrayList<>();
//            for (Apple apple: inventory){
//                if (p.test(apple)){
//                    result.add(apple);
//                }
//            }
//            return result;
//       }

       //we want to filter out only red and heavy apples
       static class AppleRedAndHeavyPredicate implements ApplePredicate{
           @Override
           public boolean test(Apple apple) {
               return (apple.getColor()).equals(RED) && apple.getWeight() > 150;
           }
       }

       public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
           List<Apple> result = new ArrayList<>();
           for (Apple apple: inventory) {
               if (p.test(apple)){
                   result.add(apple);
               }
           }
           return result;
       }

}
