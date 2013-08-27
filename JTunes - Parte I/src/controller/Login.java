package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ConnectionFactory;





/**
 * @author VandersonErick
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		String name;
		String pass;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out = response.getWriter();
			String login = request.getParameter("usuario");
			String senha = request.getParameter("senha");	
					
		try 
		{
			//Preparando para a Inserção de Dados
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement("select * from Usuarios");
			
			//Executa no Banco de Dados
			ResultSet rs = stmt.executeQuery();			
			
			name = rs.getString("nome");
			pass = rs.getString("senha");
			
			
			
							
				rs.close();
				stmt.close();
		
		}catch (SQLException e) 
			{
				System.out.println(e);
			}
			


	}
	

}
