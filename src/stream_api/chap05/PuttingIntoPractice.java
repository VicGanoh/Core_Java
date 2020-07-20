package javainaction.chap05;

import java.util.*;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String[] args) {

        Trader victor = new Trader("Victor", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader roland = new Trader("Roland", "Cambridge");
        Trader smith = new Trader("Smith", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(smith, 2011, 300),
                new Transaction(victor, 2011, 1000),
                new Transaction(victor, 2012, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(roland, 2012, 950)
        );

        // Query 1: Find all transactions in year 2011 and sort them by value(small to high)
        List<Transaction> transactionsIn2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println(transactionsIn2011);

        // Query 2: What are all the unique cities where the traders work
        List<String> uniqueCitiesOfTraders = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueCitiesOfTraders);

        // Query 3: Find all traders from Cambridge and sort them by name
        List<Trader> tradersFromCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase("cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(tradersFromCambridge);

        // Query 4: Return a string of all traders' names sorted alphabetically
        transactions.stream()
                .map( traders -> traders.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);
       // System.out.println(tradersNames);

        //  Query 5: Are any traders bases in Milan
//        Optional<String> tradersInMilan = transactions.stream()
//                .map(traders -> traders.getTrader().getCity() )
//                .filter(traders -> traders.equalsIgnoreCase("Milan"))
//                .findAny();
//        if (tradersInMilan.isPresent()){
//            System.out.println("Some traders are from Milan.");
//        }
        boolean milanBased = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));

        // Query 6: Print all transactions' values from the traders living
        // in Cambridge
        transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        // Query 7: Whats the highest value of all transactions
       int highestValue = transactions.stream()
               .map(Transaction::getValue)
                .reduce(Integer::max)
               .get();
        System.out.println(highestValue);

       // Query 8: Find the transaction with the smallest value
        int smallestValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min)
                .get();
        System.out.println(smallestValue);
    }
}
