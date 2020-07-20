package javainaction.chap05;

import javainaction.chap04_streams.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static javainaction.chap04_streams.Dish.menu;
public class Finding {

    public static void main(String[] args) {

        if (isVegetarianFriendlyMenu()){
            System.out.println("The menu is somewhat vegetarian friendly!!");
        }

        if (isHealthyMenu()){
            System.out.println("Dishes are healthy");
        }

        if (findVegetarianDish().isPresent()){
            System.out.println("Present");
        }

        Optional<Dish> dish = findVegetarianDish();
        dish.ifPresent( d -> System.out.println(d.getName()));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5) ;
        Optional<Integer> firstSquareDivisibleByThree = numbers.stream()
                .map(x -> x * x)
                .filter( x -> x % 3 == 0)
                .findFirst(); //9
        System.out.println(firstSquareDivisibleByThree.get());




    }

    //this method checks if a predicate at least matches one element
    private static boolean isVegetarianFriendlyMenu(){
        return menu.stream()
                .anyMatch(Dish::isVegetarian);
    }

    //this method checks if a predicate matches all items
    private static boolean isHealthyMenu(){
        return menu.stream()
                .allMatch(d -> d.getCalories() < 1000);
    }

    // if none matches
    private static boolean isHealthyMenu2(){
        return menu.stream()
                .noneMatch(d -> d.getCalories() >= 1000);
    }

    private static Optional<Dish> findVegetarianDish(){
        return menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
    }
}
