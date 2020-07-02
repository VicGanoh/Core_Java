package i18NandL10N;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class InternalizationDemo {
    public static void main(String[] args) {
//        ``Locale myLocale = Locale.getDefault();
//        System.out.println(myLocale.getDisplayName());
//        System.out.println(myLocale.getDisplayCountry());
//        System.out.println(myLocale.getDisplayLanguage());
//        System.out.println(myLocale.getCountry());
//        System.out.println(myLocale.getLanguage());
//        System.out.println(myLocale.getISO3Country());
//        System.out.println(myLocale.getISO3Language());
//
//
//        System.out.println("============================");
//        //a local class that prints english in different languages
//        Locale enLocale = new Locale("en","US");
//        Locale frLocale = new Locale("fr","FR");
//        Locale spLocale = new Locale("es","ES");
//
//        System.out.println("English name default: " + enLocale.getDisplayLanguage());
//        System.out.println("English name in french : " + enLocale.getDisplayLanguage(frLocale));
//        System.out.println("English name in spain : " + enLocale.getDisplayLanguage(spLocale));


        //internationalizing currency
        printCurrency(new Locale("en","IN"));
        printCurrency(Locale.US);
        printCurrency(new Locale("en","GH"));

        //internationalizing number
        System.out.println("==========Internationalizing Number============");
        printNumberFormat(Locale.CHINA);
        printNumberFormat(Locale.FRANCE);
        printNumberFormat(Locale.US);

        //Internationalizing time
        System.out.println("==========Internationalizing Time============");
        printTime(Locale.US);
        printTime(Locale.GERMANY);
        printTime(Locale.CHINA);
        printTime(Locale.UK);

        //Internationalizing time
        System.out.println("==========Internationalizing Date============");
        printDate(Locale.US);
        printDate(Locale.FRANCE);
        printDate(Locale.CHINA);
        printDate(new Locale("in","IN"));
    }

     static void printCurrency(Locale myLocale){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(myLocale);
        String currency = formatter.format(46368.232);
        System.out.println(currency + " is for locale " + myLocale.getDisplayCountry());
    }

    static void printNumberFormat(Locale locale){
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        String number = numberFormat.format(13632.32);
        System.out.println(number + " is for locale " + locale);
    }

    static void printTime(Locale timeLocale){
        DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT,timeLocale);
        Date date = new Date();
        String time = timeFormat.format(date);
        System.out.println(time + " for locale " + timeLocale);
    }

    static void printDate(Locale dateLocale){
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,dateLocale);
        Date currentDate = new Date();
        String date = dateFormat.format(currentDate);
        System.out.println(date + " for locale " + dateLocale);
    }
}
