package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;



public class TestaConexao {

	
	  public static void main(String args[]) throws SQLException {
		  
		   Connection con = Conexao.conectar();  	  
		  
		   Statement stm = con.createStatement();
	         
	         String SQL = "Select cod, titulo, autor, faixas from Albuns"; 

	         ResultSet rs = stm.executeQuery(SQL);
	         
	         
	         while(rs.next())  
	         {  
	        	int cod = rs.getInt("cod"); 
	            String tit = rs.getString("titulo");  
	            String aut = rs.getString("autor");  
	            int totalFaixas = rs.getInt("faixas");  
	 
	            System.out.println("Codigo" + cod + "Titulo: "+tit+" Autor: " +aut+ " Tot. Faixas: "+totalFaixas);  
	         }  

		   
		  
	         Conexao.desconectar(con); 
	  }
	
	  	  
	  
		
	  

}