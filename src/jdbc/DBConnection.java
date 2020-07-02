package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   private static final String USERNAME = "root";
   private static final String PASSWORD = "CaLl911);c";
   private static final String CONN = "jdbc:mysql://localhost/school?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
   private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

   public static Connection getConnection() throws SQLException {

       return DriverManager.getConnection(CONN,USERNAME,PASSWORD);
   }
}
