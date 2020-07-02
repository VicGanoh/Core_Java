package java.lamda_expressions.co.collections;

import java.lamda_expressions.co.Customer;
import java.util.*;

public class MapDemo  {
    public static void main(String[] args) {
        Customer customer1 = new Customer("26","Aba");
        Customer customer2 = new Customer("329","Carl");

        Map <String,String> customerMap = new HashMap<String,String>();
        customerMap.put(customer1.getCustomerID(),customer1.getCustomerName());
        customerMap.put(customer2.getCustomerID(),customer2.getCustomerName());

        customerMap.forEach(
                (K,V) -> System.out.println("Customer ID: " + K + ", Customer Name: " + V)
        );




      /* Set set = customerMap.entrySet();
       Iterator itr = set.iterator();

       while (itr.hasNext()){
           Map.Entry val = (Map.Entry)itr.next();
           System.out.println(val.getKey() + ": " + val.getValue());
       }
       */


       /* Iterator<String> keyIterator = customerMap.keySet().iterator();
        while (keyIterator.hasNext()){
            String nextKey = keyIterator.next();
            System.out.println("Key and Value: ");
            System.out.println(nextKey + ": " + customerMap.get(nextKey));
        }
        */




    }
}
