package javainaction.chap05;

import javainaction.chap04_streams.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static javainaction.chap04_streams.Dish.menu;

public class Mapping {

    public static void main(String[] args) {

        //Map
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(dishNames);

        //Map
        List<String> words = Arrays.asList("Hello", "Java", "World");
        List<Integer> wordLength = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordLength);

        //map (dish name lengths)
        List<Integer>  dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        //flatMap
        words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

        //map
        //printing the squares of a number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3,4);

         List<int[]> pairs = numbers1.stream()
                 .flatMap( (Integer i) ->  numbers2.stream()
                 .map((Integer j ) -> new int[]{i, j})
                 )
                 .collect(Collectors.toList());
        pairs.forEach(pair -> System.out.printf("(%d, %d)", pair[0], pair[1]));


    }
}
