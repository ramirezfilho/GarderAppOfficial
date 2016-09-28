package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;



public class ConnectionFactory {
	public Connection getConnection() {
            
	     try {
                 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                 //Class.forName("com.mysql.jdbc.Driver");
	         return  DriverManager.getConnection(
	 "jdbc:mysql://localhost/gardner", "root","");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	


}
