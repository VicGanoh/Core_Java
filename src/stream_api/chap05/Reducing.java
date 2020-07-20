package javainaction.chap05;

import javainaction.chap04_streams.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static javainaction.chap04_streams.Dish.menu;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        int multiply = numbers.stream()
                .reduce(1, (a, b) -> a*b);
        System.out.println(multiply);

        //using reduce to find the min and max value
        int max = numbers.stream().reduce(0, Integer::max);

       Optional<Integer> min =  numbers.stream().reduce(Integer::min);
       min.ifPresent(System.out::println);
        System.out.println("Maximum number: " + max);

        int countNumberOfDishes = menu.stream()
                .map( dish -> 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println(countNumberOfDishes);

        long count = menu.stream().count();
        System.out.println(count);

        int calories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0,(a, b) -> Integer.sum(a, b));
        System.out.println("Number of Calories: " + calories);

//        int sum_ = 0;
//        for (int value : numbers){
//            sum_ += value;
//        }
//        System.out.println(sum_);
    }

}
