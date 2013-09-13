package model;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  



/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE FÁBRICA DE CONEXÕES (CONNECTION FACTORY).
 * IMPLEMENTAÇÃO DE UM CONSTRUTOR QUE PERMITE "CHAMAR" A FÁBRICA DE CONEXÕES
 * A PARTIR DE OUTRAS CLASSES, SEM QUE SEJA NECESSÁRIO CRIAR TODOS OS PARÂMETROS
 * DE UMA CONEXÃO COM O BANCO DE DADOS, TODAS AS VEZES QUE SE NECESSITAR UMA CONEXÃO.
 * */

  
public class ConnectionFactory {  
      
	public Connection getConnection() {
		
	try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/jtunes", "root", "vampirodoidao");
			
			
		}
		
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}

	return null;
	}
	
	public static void Main (String[]args) throws SQLException, ClassNotFoundException
	{
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão bem-sucedida!");
		connection.close();
	}
    
    
}