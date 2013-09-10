package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

import org.omg.CORBA.DATA_CONVERSION;

import model.Contato;
import model.DAO;



/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**SERVLET RESPONSÁVEL POR RECEBER CAMPOS DE UM FORMULÁRIO DE CONTATO EM HTML
 * E GRAVAR NO BANCO DE DADOS
 * 
 * */



public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletContato() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				PrintWriter out = response.getWriter();
				
				//OBTENDO OS PARÂMETROS DO FORM HTML
				String name = request.getParameter("nome");
				String mail = request.getParameter("email");
				String end = request.getParameter("endereco");
				String telefone = request.getParameter("telefone");
				String empresa = request.getParameter("empresa");
				String mensagem = request.getParameter("mensagem");

				//CRIA UM CONTATO DA CLASSE NO SERVLET
				Contato contato = new Contato();
				
				contato.setNome(name);
				contato.setEmail(mail);
				contato.setEndereco(end);
				contato.setTelefone(telefone);
				contato.setEmpresa(empresa);
				contato.setMensagem(mensagem);
				
				//CHAMA A CLASSE DE CONEXÃO DAO
				DAO dao = new DAO();
				dao.adicionaContato(contato);

				response.sendRedirect( "contact.html" );
	
			    
				

	}
	
	
	
		public void PesquisaContato(Contato contato)
		{
				Contato con = new Contato();
				
				con.getNome();
							
				//CHAMA A CLASSE DE CONEXÃO DAO
				DAO dao = new DAO();
				dao.pesquisaContato(contato);

					
		
		}
	
		public void ExcluiContato(Contato contato)
		{
				Contato con = new Contato();
				
				con.getNome();
				
				DAO dao = new DAO();
				dao.removeContato(contato);
		
		
		}
	
	
	

}
