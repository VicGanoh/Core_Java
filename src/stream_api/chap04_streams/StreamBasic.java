package stream_api.chap04_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamBasic {

    public static void main(String[] args) {
        //Java 7
        getLowCaloricDishesNamesInJava7(Dish.menu)
                .forEach(System.out::println);
        System.out.println("-----------");

//        //Java 8
//        getLowCaloricDishesNamesInJava8(Dish.menu)
//                .forEach(System.out::println);

    }


    public static List<String> getLowCaloricDishesNamesInJava7(List<Dish> dishes){
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : lowCaloricDishes){
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }
        List<String> lowCaloricDishesName = new ArrayList<>();
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });
        for (Dish dish : lowCaloricDishes){
            lowCaloricDishesName.add(dish.getName());
        }
        return lowCaloricDishesName;
    }

    public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes){
        return dishes.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
    }

}

