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
import model.Mp3;
import model.Usuario;


/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**SERVLET PESQUISA MP3. REALIZA A BUSCA DE ARQUIVOS MP3 
 * POR MEIO DO NOME FORNECIDO EM UM CAMPO DE PESQUISA.
 * */


public class ServletPesquisarMP3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		String nome = request.getParameter( "nome" ); 
	
		/**CRIA UM OBJETO MP3 NA CLASSE SERVLETPESQUISARMP3, SETA O NOME FORNECIDO ATRAVÉS DO FORM
		 * E REALIZA A BUSCA NO BANCO DE DADOS PELO NOME. AO FINAL, REDIRECIONA PARA A PÁGINA DE CADASTRO,
		 * PERMITINDO UMA NOVA PESQUISA, INSERÇÃO OU EXCLUSÃO DE ARQUIVO MP3.
		 *  **/
		Mp3 m = new Mp3();
		m.setNome(nome);
		
		DAO bd;
		try {
			bd = new DAO();
			bd.pesquisaMP3(m);	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		response.sendRedirect("cadastrar.html");
		
		
		

	}

}
