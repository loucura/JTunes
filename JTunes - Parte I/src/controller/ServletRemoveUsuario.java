package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import model.DAO;
import model.Funcionario;
import model.Usuario;

/**
 * Servlet implementation class ServletAdicionaUsuario
 */
public class ServletRemoveUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		String cpf = request.getParameter( "cpf" ); 
				
		Usuario user = new Usuario();
		user.setCPF(cpf);
				
		DAO dao = new DAO();
		dao.removeUsuario(user);	
		
		
		//ESTÁ REMOVENDO O USUÁRIO PELO CPF, MAS NÃO REDIRECIONA A PÁGINA
		response.sendRedirect( "cadastrar.html" );
		
		
		
	}

}
