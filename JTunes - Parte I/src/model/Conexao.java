package model;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;
import java.sql.*;

  
public class Conexao {  
      
    public static Connection conectar(){  
  
    try{  
  
        
         String url = "jdbc:mysql://127.0.0.1:3306/jtunes";  
           
    	    	
        //Conexão Banco Local  
         Class.forName("com.mysql.jdbc.Driver");  
                
         
         Connection con = DriverManager.getConnection(url,"root","vampirodoidao");  
                  
         return(con);  
         
         
  
        }catch(ClassNotFoundException e){  
        	System.out.println("Classe Não Encontrada");  	
            e.printStackTrace();  
  
            return null;  
  
        }catch(SQLException e){  
        	System.out.println("Erro. Verifique os Dados Fornecidos");  
            e.printStackTrace();  
  
            return null;  
        }  
    }  
    
    
    public static void desconectar(Connection conexao){  
    	  
        try{  
            conexao.close();  
       
        	}catch(Exception e){  
        	System.out.println("Houve erro no fechamento da conexão");  	
            e.printStackTrace();  
      
        }  
    }  
    
    
    
}