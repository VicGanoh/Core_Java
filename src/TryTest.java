import java.io.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;

import java.security.*;

public class TryTest {


    public static void main(String[] args)  {

//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();

        // Write your code here.
//        Set<Currency> currencies = Currency.getAvailableCurrencies();
//        for (Currency currency: currencies){
//            System.out.println(currency.getDisplayName());
//        }

        /* Create custom Locale for India.
          I used the "IANA Language Subtag Registry" to find India's country code */
//      Locale indianLocale = new Locale("en","IN");
//
//      /*Create NumberFORMATS using locale*/
//        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat india = NumberFormat.getCurrencyInstance(indianLocale);
//        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//
//        System.out.println("US: " + us.format(payment));
//        System.out.println("India: " + india.format(payment));
//        System.out.println("China: " + china.format(payment));
//        System.out.println("France: " + france.format(payment) );

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) return false;
        int[] c = new int[26];
        int[] d = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ) return false;
        return true;
    }



}