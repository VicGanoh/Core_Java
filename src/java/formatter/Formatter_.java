package java.formatter;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class Formatter_ {
    public static void main(String[] args) {

        //using argument_index
        Formatter f = new Formatter();
        f.format(Locale.FRANCE, "%.5f", -1325.789);
        System.out.println(f);
        f.close();

        //Regionalize Output
        Formatter f2 = new Formatter();
        f2.format(Locale.CANADA, "%.5f", -1325.789);
        System.out.println(f2);
        f2.close();

        //Regionalize Date
        Formatter f3 = new Formatter();
        f3.format(Locale.US, "%1$tZ", Calendar.getInstance());
        System.out.println(f3);
        f3.close();


        //using the escape sequence %n and %% specifiers
        try {
            Formatter f4 = new Formatter();
            f4.format("Copying File%nTransfer is %d%% complete.", 88);
            System.out.println(f4);
            f4.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }


        //creating a table of squares and cubes
        for (int i = 0; i < 10; i++) {
            Formatter f5 = new Formatter();
            f5.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(f5);
            f5.close();
        }


        //Alternative using printf to automatically create a formatted string
        System.out.printf("%s %s %s %s %n%s %.2f", "This", "is", "a", "String");

    }
}
