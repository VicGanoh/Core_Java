package jdbc;


import java.sql.*;
import jdbc.table.students;

/**
 * Created with IntelliJ IDE
 * By Victor Tetteh Ganoh Ahumah
 * Date : 15/06/20
 * Time : 16:12
 */
public class JDBCTest {

    public static void main(String[] args) throws SQLException {


        try(
                Connection connection = DBConnection.getConnection(); //Establish a connection
                Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);  //create statement
                ResultSet rs = stmt.executeQuery("SELECT * FROM students"); //execute a statement
                ) {


            students.getStudents(rs);

//            //moving cursor to the last position and get the name of the last person
             rs.last();
            System.out.println("Last Student: \nId number: " + rs.getInt("id") + ",  " +
                    rs.getString("first_name") + " " + rs.getString("last_name") + " "+ rs.getDate("dob"));

            rs.first(); //check details of first student
            System.out.println("First Student: \nId number: " + rs.getInt("id") + ",  " +
                    rs.getString("first_name") + " " + rs.getString("last_name") + " "+ rs.getDate("dob"));

            rs.absolute(3); //get a student on any row
            System.out.println("Student is: \nId number: " + rs.getInt("id") + ",  " +
                    rs.getString("first_name") + " " + rs.getString("last_name") + " "+ rs.getDate("dob"));



//            System.out.println("Connected.");
//            System.out.println(rs.getRow());  //get the number of rows

        }
        catch (Exception e){
            System.out.println("Exception :" + e.getMessage());
        }



    }
}
