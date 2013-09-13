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
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**SERVLET REMOVE MP3. REALIZA A REMOÇÃO DE ARQUIVOS CADASTRADOS 
 * NO BANCO DE DADOS POR MEIO DO NOME (ÚNICO) FORNECIDO EM UM CAMPO ESPECÍFICO.
 * */


public class ServletRemoveUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		String cpf = request.getParameter( "cpf" ); 
		
				
		/**CRIA UM OBJETO DO TIPO USUÁRIO NA CLASSE SERVLET REMOVE USUÁRIO, SETA O CPF FORNECIDO ATRAVÉS DO FORM
		 * E REALIZA A BUSCA NO BANCO DE DADOS PELO CPF. AO FINAL, REMOVE E REDIRECIONA PARA A PÁGINA DE CADASTRO,
		 * PERMITINDO UMA NOVA PESQUISA, INSERÇÃO OU EXCLUSÃO DE UM "NOVO" USUÁRIO MP3.
		 *  **/
		
		Usuario user = new Usuario();
		user.setCPF(cpf);
				
		DAO dao;
		try {
			dao = new DAO();
			dao.removeUsuario(user);	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//ESTÁ REMOVENDO O USUÁRIO PELO CPF, MAS NÃO REDIRECIONA A PÁGINA
		response.sendRedirect( "cadastrar.html" );
		
		
		
	}

}