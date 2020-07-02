package files_io;

import java.io.*;

public class Serialization_ {
    public static void main(String[] args) {

        //create an object for Employee
        Employee employee = new Employee();
        employee.setName("Victor Aik");
        employee.setAddress("Padmore Street");

        try {
            // we are writing the object to this file
            FileOutputStream file = new FileOutputStream("C:\\Directory\\serialized.txt");

            //serialize object and pass in the file wwe are working with into the ObjectInputStream param
            ObjectOutputStream objectSerialized = new ObjectOutputStream(file);
            //write the object to the Byte Stream
            objectSerialized.writeObject(employee);
            objectSerialized.close();
            file.close();
            System.out.printf("%s %s %d%% %s and saved in %s",  "Serialized", "data", 100, "complete", "serialized.txt file" );
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
        }

        System.out.println();

        System.out.println("Serialized Object...");
        try {
            FileInputStream file_ = new FileInputStream("C:\\Directory\\serialized.txt");
            int i;
            while ((i = file_.read()) != -1){
                System.out.print((char)i);
            }
            file_.close();
        }catch (IOException E){
            E.printStackTrace();
        }

        System.out.println();
        System.out.println("---------------------------------------");

         //Deserialize an Object
        employee = null;
        try {
//            FileInputStream readFile =  new FileInputStream("C:\\Directory\\serialized.txt");
            ObjectInputStream objectInputDeserialize = new ObjectInputStream(new FileInputStream("C:\\Directory\\serialized.txt"));
            employee = (Employee) objectInputDeserialize.readObject();
            objectInputDeserialize.close();
        }catch (IOException  | ClassNotFoundException e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.print("Deserializing Employee...\n" + "Employee Name: " + employee.getName() + "\n");
            System.out.println("Employee's Address : " +  employee.getAddress());
        }

    }
}
