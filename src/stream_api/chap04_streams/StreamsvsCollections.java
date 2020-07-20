package javainaction.chap04_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsvsCollections {

    public static void main(String[] args) {

//        List<String> names = Arrays.asList("Victor", "Denis", "Michael");
//        names.stream().forEach(System.out::println);


        List<String> names = Arrays.asList("Victor", "Denis", "Michael");
        names.forEach(name -> System.out.println(name));

        //Alternative method referencing
        names.forEach(System.out::println);
   }
}
