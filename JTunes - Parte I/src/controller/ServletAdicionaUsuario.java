package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import sun.swing.BakedArrayList;
import exceptions.UsuarioException;
import model.DAO;
import model.Funcionario;
import model.Usuario;

/**
 * Servlet implementation class ServletAdicionaUsuario
 */
public class ServletAdicionaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAdicionaUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		
		Usuario user = new Usuario();
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		String nome = request.getParameter( "nome" ); 
		String pass = request.getParameter( "senha" ); 
		String cpf = request.getParameter("cpf");	
						
		user.setNome(nome);		
		user.setSenha(pass);
		user.setCPF(cpf);
		

		DAO dao = new DAO();
		dao.adicionaUsuario(user);	
		
		response.sendRedirect( "cadastrar.html" );
	}

}
