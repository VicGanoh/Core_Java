package java.lamda_expressions.co.collections;

import java.util.*;

public class List {
    public static void main(String[] args) {

        //myList1 can only store String objects
        ArrayList<String> myList1 = new ArrayList<String>(); //type specific

        ArrayList myList2 = new ArrayList(); //list2 can store any type of object any type

        //1. Add Data to list
        myList1.add("Victor"); //0
        myList1.add("Ganoh");  //1
        myList1.add("Eben");   //2
        myList1.add("Abigail"); //3
        myList1.add("Gemini");  //4
     // myList1.add(20);  //error
      //  myList1.add(3.5); //error

        myList2.add("Victor");
        myList2.add("Ganoh");
        myList2.add('E');
        myList2.add(24);
        myList2.add(5.4);

        //print reference to list -> shall print the list the way we added in a sequence
        System.out.println("My first list: " + myList1);
        System.out.println("My second list: "+ myList2);

        //2. Get the element from list
        String name = myList1.get(2);
        System.out.println("str :"+ name);

        Object obj = myList2.get(3);
        System.out.println("obj: "+ obj);

        //3. Update element in list
        myList1.set(2,"Martha");
        System.out.println("Update of list 1: "+myList1);

        //4. Remove an element from a list
        myList1.remove("Victor");
        System.out.println("Updated list after remove: " + myList1);

        if (myList1.contains("Ganoh"))
            System.out.println("Ganoh is in the list>");

        //5.Iterate in ArrayList
        System.out.println("<<<Iterating with For loop>>>>");
        for (int i=0; i<myList1.size(); i++) {
            System.out.println(myList1.get(i));
        }
        System.out.println("<<<<>>>>>>>");
        System.out.println();

        System.out.println("<<<Iterating with Enhanced For loop>>>>");
        for (String str: myList1) {
            System.out.println(str);
        }
        System.out.println("<<<<>>>>>>>");
        System.out.println();

        System.out.println("<<<Iterating with Iterator>>>>");
        Iterator<String> list = myList1.iterator();
      /*  System.out.println(list.next());
        System.out.println(list.next());
        System.out.println(list.next());
       */
        while (list.hasNext()){
            String str = list.next();
            if (str.equals("Abigail")){
                list.remove();
            }
          }
        System.out.println("After iteration: "+ myList1);







    }
}
