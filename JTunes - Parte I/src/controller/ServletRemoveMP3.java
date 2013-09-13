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


/**SERVLET REMOVE MP3. REALIZA A REMOÇÃO DE ARQUIVOS CADASTRADOS 
 * NO BANCO DE DADOS POR MEIO DO NOME (ÚNICO) FORNECIDO EM UM CAMPO ESPECÍFICO.
 * */


public class ServletRemoveMP3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		String nome = request.getParameter( "nome" ); 
		
		
		/**CRIA UM OBJETO MP3 NA CLASSE SERVLET REMOVE MP3, SETA O NOME FORNECIDO ATRAVÉS DO FORM
		 * E REALIZA A BUSCA NO BANCO DE DADOS PELO NOME. AO FINAL, REMOVE E REDIRECIONA PARA A PÁGINA DE CADASTRO,
		 * PERMITINDO UMA NOVA PESQUISA, INSERÇÃO OU EXCLUSÃO DE UM "NOVO" ARQUIVO MP3.
		 *  **/
		
		Mp3 m = new Mp3();
		m.setNome(nome);
				
		DAO dao;
		try {
			dao = new DAO();
			dao.removeMP3(m);	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//REDIRECIONA PARA A PÁGINA PRINCIPAL DE CADASTROS
		response.sendRedirect( "cadastrar.html" );
		
		
		
	}

}
