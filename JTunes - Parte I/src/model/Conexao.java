package model;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;
import java.sql.*;

 

/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE DE CONEXÃO COM O BANCO DE DADOS
 * */


public class Conexao {  
      
    public Connection getConnection(){  
  
    try{  
  
    	 /**CAMINHO DO BANCO DE DADOS DO PROJETO LOCAL**/
         String url = "jdbc:mysql://127.0.0.1:3306/jtunes";  
           
    	    	
         /**DRIVER DE CONEXÃO UTILIZADO**/  
         Class.forName("com.mysql.jdbc.Driver");  
                
         /**AQUISIÇÃO DE USUÁRIO E SENHA PARA CONEXÃO COM O BANCO DE DADOS**/
         Connection con = DriverManager.getConnection(url,"root","vampirodoidao");  
         
         /**RETORNA O ESTADO DA CONEXÃO**/
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