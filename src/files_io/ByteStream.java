package files_io;
import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException{
        //read a file and check whether it exists
        try{
            FileReader file = new FileReader("C://Users/BESTDEAL/Documents/mytext.txt"); //file destination
            int i  ;
            i = file.read();
            System.out.println((char) i);
            file.close();
             }catch(FileNotFoundException e){
           //System.out.println("File not found.");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("Exception: " + e);
        }
    }
}