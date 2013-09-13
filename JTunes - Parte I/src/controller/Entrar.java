package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import model.ConnectionFactory;
import model.DAO;
import model.Usuario;


/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**SERVLET QUE CONTROLA O LOGIN DE USUÁRIOS JUNTO 
 * AO BANCO DE DADOS.
 * 
 * */
public class Entrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	
	/**RECEBE OS PARÂMETROS DE UM FORMULÁRIO (FORM) HTML E "SETA" OS VALORES PARA O USUÁRIO.
	 * CRIA UM OBJETO QUE PERMITE CONSULTAR O BANCO DE DADOS E REPASSA O USUÁRIO E SENHA 
	 * PARA VALIDAR OS DADOS DE LOGIN.
	 * */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		String nome = request.getParameter( "usuario" ); 
		String pass = request.getParameter( "senha" ); 
		
		Usuario user = new Usuario();
		user.setNome(nome);
		user.setSenha(pass);
		
		DAO bd;
		boolean resposta = false;
		
			try {
				bd = new DAO();
				bd.Login(user);	
				resposta = bd.Login(user); 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		
		 
		  
		if (resposta == true)
		{  
		 JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso. Você Será Redirecionado.");  
		 response.sendRedirect("index.html");
		  
		}
		else
		{  
		 JOptionPane.showMessageDialog(null, "Dados inválidos. Verifique Login e/ou Senha"); 
		 response.sendRedirect("login.html");
		 
		}
		
		
		
		

	}
	
	
	
	
	
	


}