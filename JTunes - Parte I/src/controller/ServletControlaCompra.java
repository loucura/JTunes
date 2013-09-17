package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;



/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**SERVLET RESPONSÁVEL POR RECEBER OS DADOS DE UMA COMPRA. 
 * A FUNÇÃO BÁSICA É RECEBER A QUANTIDADE DE ITENS, O PREÇO E O NOME DOS ITENS, CALCULAR O VALOR 
 * TOTAL E REPASSAR OS DADOS PARA O SERVLET DE PAGAMENTO.* 
 * 
 * */
public class ServletControlaCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletControlaCompra() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	/**VERIFICA UMA LISTA DE NOMES PARA POSTERIORMENTE VALIDAR USUÁRIOS */
	private boolean Verifica(Enumeration lista_nomes, String nome) {
		while( lista_nomes.hasMoreElements() ) 
		{
			String nomeDaLista = (String) lista_nomes.nextElement();
		
			if( nomeDaLista.compareTo(nome) == 0 ) 
			{
				return true;
			}
		}
		return false;
		
	}
	
	
	
	/**EM CONSTRUÇÃO*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
			
			
		
		Enumeration parametros = request.getParameterNames();  
	
		boolean b;
		Vector strVector = new Vector(); 
		String str = new String();	
			
		 while (parametros.hasMoreElements())
		 {	 
			 
			    
				String parametro = (String) parametros.nextElement(); 
				
				out.println("<br />" + parametro + " = " + request.getParameter(parametro)); 
				
				if( parametro.equals("Reginaldo Rossi")) 
				{
					JOptionPane.showMessageDialog(null, parametro + " Adicionado com sucesso");
										
					
				}
				
				
				
				
				    

		}
		response.sendRedirect("index.html");
		
		
		
		//DELETA O ARQUIVO ANTES DE INSERIR NOVOS VALORES
		//File f = new File("/home/vanderson/git/JTunes - Parte I/JTunes - Parte I/comprasrealizadas.txt");
		//f.delete();
		
		//GRAVA ARQUIVO NO DISCO
		//FileWriter fw = new FileWriter("/home/vanderson/git/JTunes - Parte I/JTunes - Parte I/comprasrealizadas.txt",true);
		
		
		
		
		//FECHA O FILEWRITER
		//fw.close();
			
		//response.sendRedirect("index.html");
		
		
	}

}
