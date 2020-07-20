package stream_api.chap04_streams;

import java.util.List;
import java.util.stream.Collectors;

import static stream_api.chap04_streams.Dish.menu;

public class HighCaloriesNames {

    public static void main(String[] args) {

        List<String> names = menu.stream()
                .filter(dish -> {
                   // System.out.println("Filtering " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map( dish -> {
                   // System.out.println("mapping " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
