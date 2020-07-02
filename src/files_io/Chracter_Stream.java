package files_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Chracter_Stream {
    public static void main(String[] args) throws IOException {
        //write to a stream
       try {
           FileWriter fw = new FileWriter("c:\\Users/BESTDEAL/Documents/WriteStream.txt");
           fw.write("My name is Ganoh");
           fw.close();
           System.out.println("Success");
       }
       catch(Exception e){
           System.out.println(e);
       }

      //read from a file
        try {
            FileReader fr = new FileReader("c:\\Users/BESTDEAL/Documents/WriteStream.txt");
            int i;
            while ((i=fr.read()) != -1){
                System.out.print((char) i);
            }
            fr.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
