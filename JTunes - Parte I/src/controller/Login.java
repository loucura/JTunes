package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;



import model.Conexao;

/**
 * @author VandersonErick
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String coringa;
	int valor;
	   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// String login = request.getParameter( "usuario" );
	     //String senha = request.getParameter( "senha" );
	     
	     PrintWriter out = response.getWriter();
		 out.println(getServletConfig().getInitParameter("login_administrador"));
		 out.println(getServletConfig().getInitParameter("senha_administrador"));
		
	}}	 //  Connection con = Conexao.conectar();  	  
		  
		  // Statement stm = null ;
		   
		  
		
		 //  try {
			
			//stm = con.createStatement();
			
		//	} catch (SQLException e) {
			
				//e.printStackTrace();
			//}
	         
	       //  String SQL = "Select cod, nome, senha from Usuarios"; 
	         
	        // ResultSet rs = null;
			
	       // try {
				
			//	rs = stm.executeQuery(SQL);
				
			//	} catch (SQLException e) {
				
			//	e.printStackTrace();
		//	}
	         
	        //Obtendo os dados do banco de dados.
	       // try {
			//	while(rs.next())  
			//	 {  
				//	try {
			//			int cod = rs.getInt("cod");
				//		String user = rs.getString("nome"); 
				//	   	int pass = rs.getInt("senha");
					
					  			   	
				//	   	 response.sendRedirect( "admin.html" );
			     
				      //   Conexao.desconectar(con); 
					   	
					
					//} catch (SQLException e) {
						
					//	e.printStackTrace();
					//}  

				// }
		//	} catch (SQLException e) {
				
			//	e.printStackTrace();
	//		}  
	        
	//}		
	

	

	

	

//}
