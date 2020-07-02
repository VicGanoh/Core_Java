package files_io;

import java.io.Serializable;

//Serializable interface has been implemented to serialize the object of Employee class
//converting its object to streams of bytes
public class Employee implements Serializable {

   private String name;
   private String address;

    public Employee() {
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
