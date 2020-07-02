package files_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile_ {
    public static void main(String[] args) throws IOException {

        File myDir = new File("C:\\Directory");
        if (!myDir.exists()){
            if (myDir.mkdir()){
                System.out.println("Directory created");
            }
            else{
                System.out.println("Failed to create directory");
            }
        }

        //creating sub folder
        String dir = "C:\\Directory\\subDirectory\\file";
        File myFile2 = new File(dir);

        //create directory
        myFile2.mkdirs();

        //write to the file in a specified path
        FileWriter writeToFile = null;
        try {
            writeToFile = new FileWriter("C:\\Directory\\subDirectory\\file/myFile.txt");
                writeToFile.write("Hello Java world");
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            writeToFile.close();
            System.out.println("Success.");
        }

        //read the file
        try {
            FileReader file = new FileReader("C:\\Directory\\subDirectory\\file/myFile.txt");
           int readFile ;
            while (( readFile = file.read()) != -1){
                System.out.print((char)readFile);
            }
            file.close();
        }
        catch (Exception e){
            System.out.println("Exception: " + e);
        }


    }
}
