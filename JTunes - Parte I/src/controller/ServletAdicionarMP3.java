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


/**SERVLET RESPONSÁVEL POR ADICIONAR OS PARÂMETROS:
 * @param NOME, PREÇO, GÊNERO 
 * E O "CAMINHO" DO ARQUIVO MP3 NO BANCO DE DADOS.
 * */

public class ServletAdicionarMP3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		/**RECEBE VIA FORMULÁRIO OS PARÂMETROS**/
		String nome = request.getParameter( "nome" ); 
		String preco = request.getParameter( "preco" ); 
		String gen = request.getParameter("generomusical");
		
		
		
		Mp3 m = new Mp3();
		
		/**"SETA" OS CAMPOS NOME, PREÇO E GÊNERO DO MODELO MP3**/
		m.setNome(nome);
		m.setPreco(preco);
		m.setGenero(gen);
		
		/**LOCALIZAÇÃO REAL DO ARQUIVO MP3, SENDO "INFORMADA" AO BANCO DE DADOS.**/
		m.setCaminho("/home/vanderson/git/JTunes - Parte I/JTunes - Parte I/Músicas/UPLOAD" + request.getParameter( "nome" ) + ".mp3");
		
		/**CRIA UM OBJETO DE CONEXÃO COM O BANCO DE DADOS E ADICIONA O OBJETO MP3 ATRAVÉS DO MÉTODO adicionaMP3**/
		DAO dao;
		try {
			dao = new DAO();
			dao.adicionaMP3(m);	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/**APÓS ADICIONAR O MODELO MP3, REDIRECIONA A PÁGINA PARA UM NOVO CADASTRO.**/
		response.sendRedirect( "cadastrar.html" );
		
		
		
	}

}
