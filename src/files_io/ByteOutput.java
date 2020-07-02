package files_io;
import java.io.*;
public class ByteOutput {
    public static void main(String[] args) {
        //write to a file using the Byte stream
     /*  try{
        FileOutputStream foc = new FileOutputStream("c:\\Users/BESTDEAL/Documents/WriteStream.txt");
        foc.write(65);
        foc.close();
        System.out.println("Please kindly check the document if the character is printed.");
       }catch(Exception e){
           e.printStackTrace();
       }
      */

     //how to write a series of string to a file
        try{
            FileOutputStream fos = new FileOutputStream("c:\\Users/BESTDEAL/Documents/WriteStream.txt");
            String txt = "Welcome to Java Tutorial.";
            byte[] b = txt.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Success");
        }
        catch(Throwable e){
            System.out.println(e);
        }

    }
}
