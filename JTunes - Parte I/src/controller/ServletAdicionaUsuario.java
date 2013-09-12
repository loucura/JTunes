package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.xml.ws.Response;

import sun.swing.BakedArrayList;
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


/**SERVLET RESPONSÁVEL POR ADICIONAR OS PARÂMETROS:
 * @param NOME, SENHA, CPF DE UM MODELO DE USUÁRIO
 * 
 * */


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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Usuario user = new Usuario();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //DEFINE O TIPO DOS DADOS
		String nome = request.getParameter( "nome" );
		String pass = request.getParameter( "senha" ); 
		String cpf = request.getParameter("cpf");	
			
		
		
		
			boolean resposta = user.VerificaNome(nome);  
			
			if (resposta == true)
			{  
			 JOptionPane.showMessageDialog(null, "Prossiga");  
			// response.sendRedirect("index.html");
			  
			}
			else
			{  
			 JOptionPane.showMessageDialog(null, "Nome em Branco"); 
			 response.sendRedirect("novo_usuario.html");
			 
			}
			
			
		
		user.setNome(nome);
		user.setSenha(pass);
		user.setCPF(cpf);
		


	}

	
	
	
	
	
	
}
