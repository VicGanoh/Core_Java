package files_io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException {
        char c;
        //Use BufferedReader for console input
        BufferedReader input;
        input = new BufferedReader(new InputStreamReader(System.in));
       /* System.out.println("Enter a character,'q' to quit: ");


        do{
            c = (char) input.read();
            System.out.println(c);
        }while (c != 'q');*/

        //reading a string
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter stop to quit.");
        input = new BufferedReader(new InputStreamReader(System.in));
        do {
            str = input.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
