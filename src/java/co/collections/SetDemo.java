package java.lamda_expressions.co.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet();
        names.add("Ganoh");
        names.add("Victor");
        names.add("Godwin");
        names.add("chino");

        //1. Data is unique, no redundancy
        //2. Data is unordered in output due to hashing
        System.out.println("Set is : " + names);

        names.forEach( (n) -> System.out.println(n));

      /*  Iterator<String> str = names.iterator();
        while (str.hasNext()){
            String name = str.next();
            System.out.println(name);
        }
       */

        LinkedHashSet names2 =new LinkedHashSet();
        names2.add("Ganoh");
        names2.add("Victor");
        names2.add("Godwin");
        names2.add("chino");
        System.out.println("Linked HashSet: ");
        System.out.println(names2);
    }
}
