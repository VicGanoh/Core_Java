package java.lamda_expressions.co;

public class Customer {
    private String customerID;
    private String customerName;

    public  Customer (){}

    public Customer(String id, String Name){
        customerID = id;
        customerName = Name;
    }

    public String getCustomerID(){
        return customerID;
    }

    public  void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
