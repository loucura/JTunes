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
import javax.swing.JOptionPane;

import model.ConnectionFactory;
import model.DAO;
import model.Funcionario;
import model.Usuario;





/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**SERVLET PESQUISA USUARIO. REALIZA A BUSCA DE USUÁRIOS CADASTRADOS 
 * NO BANCO DE DADOS POR MEIO DO CPF FORNECIDO EM UM CAMPO ESPECÍFICO.
 * */




public class ServletPesquisaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		String cpf = request.getParameter( "cpf" ); 
	
		
		/**CRIA UM OBJETO DO TIPO USUÁRIO NA CLASSE SERVLET PESQUISA USUÁRIO, SETA O CPF FORNECIDO ATRAVÉS DO FORM
		 * E REALIZA A BUSCA NO BANCO DE DADOS, PELO CPF. AO FINAL, REDIRECIONA PARA A PÁGINA DE PESQUISA DE USUÁRIOS.
		 *  **/
		
		Usuario user = new Usuario();
		user.setCPF(cpf);
		
				
		DAO bd;
		try {
			bd = new DAO();
			bd.pesquisaUsuario(user);	
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.sendRedirect("pesquisar_usuario.html");
		
		
		

	}

}