package model;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  


  
public class ConnectionFactory {  
      
	public Connection getConnection() {
		
	try {
		
			return DriverManager.getConnection("jdbc:mysql://localhost/jtunes", "root", "vampirodoidao");
			
		}
		
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
			
		}

		
	}
	
	public static void Main (String[]args) throws SQLException
	{
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão bem-sucedida!");
		connection.close();
		
	}
    
    
}