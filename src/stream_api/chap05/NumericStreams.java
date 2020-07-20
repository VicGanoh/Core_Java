
package stream_api.chap05;

import stream_api.chap04_streams.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static stream_api.chap04_streams.Dish.menu;

public class NumericStreams {

    public static void main(String[] args){

        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("Number of calories: " + calories);

        //max and OptionalInt
        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        int max;
        max = maxCalories.orElse(1);
//        if (maxCalories.isPresent()){
//            max = maxCalories.getAsInt();
//        }
//        else {
//            // we can decide to choose a default value
//            max = 1;
//        }
        System.out.println(max);

//        int max = menu.stream()
//                .map(dish -> dish.getCalories())
//                .reduce(0, (a, b) -> Integer.max(a, b));
//        System.out.println(max);

        // Numeric ranges
        IntStream evenNumbers = IntStream.rangeClosed(1,100)
                .filter(n -> n % 2 == 0);
        System.out.println(evenNumbers.count());

        Stream<int[]> pythagoreanTriples = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                                               .filter(b -> Math.sqrt(a*a + b*b ) % 1 == 0).boxed()
                                               .map(b -> new int[]{a, b, (int)Math.sqrt(a * a + b * b)}));


        pythagoreanTriples.limit(5).forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

    }
}
