package stream_api.chap05;

import stream_api.chap04_streams.Dish;

import static java.util.stream.Collectors.toList;
import static stream_api.chap04_streams.Dish.menu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

    public static void main(String[] args) {
        //Filtering with predicate
        System.out.println("Filtering with Predicate");
        System.out.println("Vegetarian Dish(es)");
        List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian).collect(toList());
        vegetarianMenu.forEach(System.out::println);
        System.out.println("=======");


        //Skipping elements
        List<Dish> dishes = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .collect(toList()) ;
        dishes.forEach(System.out::println);
        System.out.println("=======");


        //Using streams to filter the first two meat
        //Truncating a stream
        List<Dish> firstTwoMeatDish = menu.stream()
                .filter(dish -> dish.getType().equals(Dish.Type.MEAT))
                .limit(2)
                .collect(toList());
        firstTwoMeatDish.forEach(System.out::println);
        System.out.println("=================");


        //Filtering unique elements
        System.out.println("Filtering Unique Elements:");
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct()
                .forEach(System.out::println);
        System.out.println("=========================");
        System.out.println();


        //Slicing a stream
        //This list is sorted in ascending order of number of calories.
        List<Dish> specialMenu = Arrays.asList(
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );
        System.out.println("Filtered Sorted Menu: ");
        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        filteredMenu.forEach(System.out::println);

        System.out.println("======================");

        //Sorted menu sliced with takeWhile() method
        List<Dish> slicedMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        slicedMenu1.forEach(System.out::println);

        //Sorted menu sliced with dropWhile() method
        System.out.println("Sorted Menu sliced with dropWhile():");
        List<Dish> slicedMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        slicedMenu2.forEach(System.out::println);
        System.out.println("===========================");
    }
}
