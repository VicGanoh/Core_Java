package jdbc.add_info;

import java.sql.*;
import java.util.Scanner;

public class AddInfoMain {

    final static String USER = "root";
    final static String PASSWORD = "CaLl911);c";
    final static String SQL_URL = "jdbc:mysql://localhost/school?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";;

    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);

        //get user input and add to database
        System.out.println("Do you want to add a student: Y/N");
        String ans;
        ans = input.nextLine();

        if (ans.equalsIgnoreCase("y")){
            System.out.println("Enter Student's id: ");
            String id = input.nextLine();

            System.out.println("Enter Student's First Name:");
            String f_name = input.nextLine();

            System.out.println("Enter Student's Last Name:");
            String l_name = input.nextLine();

            System.out.println("Enter Student's DoB:");
            String dob = input.nextLine();

            System.out.println("Enter Student's level(eg.100 etc...):");
            String level = input.nextLine();

            System.out.println("Enter Student's email:");
            String email = input.nextLine();

            System.out.println("Enter Student's fee:");
            String fee = input.nextLine();

            //create an object of class addStudents and add students to database
            addStudents create_student = new addStudents();
            create_student.add(id, f_name, l_name, dob, level, email, fee);

            System.out.println("Added to database.");

        }
        else {
            System.exit(1);
        }




        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String read = "SELECT * FROM Students";


        try{
            Class.forName(JDBC_DRIVER);

             connection = DriverManager.getConnection(SQL_URL, USER, PASSWORD);
             stmt = connection.prepareStatement(read);
             rs = stmt.executeQuery();


            while(rs.next()){

                System.out.print("Students ID: " + rs.getInt("id") + ", ");
                System.out.print("First Name: " + rs.getString("first_name") + ",  ");
                System.out.print("Last Name: "+ rs.getString("last_name") + "  ");

                System.out.print("DoB: " + rs.getDate("dob") + ", ");
                System.out.print("Level: " + rs.getInt("level") + ", ");
                System.out.println("Email: " + rs.getString("email"));
                System.out.print("=============================================================");
                System.out.println();
            }

        }
        catch (Exception e){
            System.err.println(e);
        }
        finally {
            if (rs!=null)
                rs.close();
            if (stmt!=null)
                stmt.close();
            if (connection!=null)
                connection.close();
        }





    }
}
