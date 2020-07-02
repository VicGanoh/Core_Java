package jdbc.table;

import java.sql.ResultSet;
import java.sql.SQLException;

public class students {

    //method to retrieve data from table
    public static void getStudents(ResultSet rs)throws SQLException {
       //loop to loop through our students table
        while(rs.next()){

            System.out.print("Students ID: " + rs.getInt("id") + ", ");
            System.out.print("First Name: " + rs.getString("first_name") + ",  ");
            System.out.print("Last Name: "+ rs.getString("last_name") + "  ");

//            System.out.print("DoB: " + rs.getDate("dob") + ", ");
//            System.out.print("Level: " + rs.getInt("level") + ", ");
//            System.out.println("Email: " + rs.getString("email"));
//            System.out.print("===========================================================================");

            System.out.println();
        }
    }
}
