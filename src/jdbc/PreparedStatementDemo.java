package jdbc;

import java.sql.*;

import jdbc.table.students;

public class PreparedStatementDemo {

    private static final String SQL = "SELECT * FROM Students WHERE fee <= ?";

    public static void main(String[] args) throws SQLException {

        double maxFee;

        try{
            maxFee = Input.getDouble("Enter a maximum fee: ");
        }
        catch (Exception e){
            System.err.println("Error: Invalid Number.");
            return;
        }

        ResultSet rs = null;

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            preparedStatement.setDouble(1, maxFee);

               rs = preparedStatement.executeQuery();
            students.getStudents(rs);
        }
        catch (Exception e){
            System.err.println(e);
        }
        finally {
            if (rs!=null)
                rs.close();
        }

    }
}
