package jdbc.add_info;

import jdbc.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addStudents {

    public addStudents(){

    }

    public void add(String id, String fname, String lname, String dob, String level, String email, String fee){

        String query = "INSERT INTO Students (Id, first_name, last_name, dob, level, email, fee) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement pStatement = connection.prepareStatement(query);
                ) {


            pStatement.setString(1, id);
            pStatement.setString(2, fname);
            pStatement.setString(3, lname);
            pStatement.setString(4, dob);
            pStatement.setString(5, level);
            pStatement.setString(6, email);
            pStatement.setString(7, fee);

            pStatement.execute();

        }
        catch(SQLException e){
            System.err.println(e);
        }


    }
}
