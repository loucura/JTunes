package controller;

import java.awt.Rectangle;
import java.awt.print.Pageable;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

import model.Compra;
import model.DAO;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;



/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**SERVLET EM CONSTRUÇÃO.
 * PERMITE RECEBER DADOS DE UM FORMULÁRIO DE PAGAMENTO
 * E GERAR UM BOLETO EM .PDF COM OS DADOS DE USUÁRIO E 
 * DA COMPRA REALIZADA. 
 * */


public class ServletPagamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletPagamento() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); //Define o tipo dos dados
		
		/**RECEBENDO OS DADOS DO FORMULÁRIO**/
		String nome = request.getParameter( "nome" ); 
		String email = request.getParameter( "email" ); 
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String cidade = request.getParameter("cidade");
		
		/**VALOR, SERÁ O VALOR TOTAL DA COMPRA REALIZADA**/
		String valor = request.getParameter("valor");
		
		/**CRIA UM OBJETO COMPRA E SETA OS CAMPOS DE CONTATO (IDENTIFICAÇÃO) DO USUÁRIO**/		
		Compra c = new Compra();
		c.setNome(nome);
		c.setEmail(email);
		c.setEndereco(endereco);
		c.setTelefone(telefone);
		c.setCidade(cidade);
		c.setQuantidade(1);
		c.setValor("abc");
		
		/**CRIA UM OBJETO DE CONEXÃO COM O BANCO DE DADOS E REPASSA OS PARÂMETROS ANTERIORES PARA GRAVAR NO BANCO**/
		DAO dao;
		try {
			dao = new DAO();
			dao.adicionaCompra(c);
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
			
		
		/**PREPARAÇÃO PARA GERAR O BOLETO EM PDF COM A BIBLIOTECA ITEXT**/
		com.itextpdf.text.Document doc = null;

		/**CRIA UM STREAM**/
		FileOutputStream os = null;

   

       try {
 
    	   		/**DEFINE AS DIMENSÕES DO DOCUMENTO FINAL **/
    	   		doc = new com.itextpdf.text.Document(PageSize.A4, 72, 72, 72, 72);
     
    	   		/**INDICA O CAMINHO DE SAÍDA DO BOLETO
    	   		 * NESTE CASO, POR ALGUM MOTIVO DESCONHECIDO, NÃO FOI POSSÍVEL UTILIZAR PARÂMETROS DE INICIALIZAÇÃO
    	   		 * PARA EVITAR PASSAR TODO O CAMINHO NESTA VARIÁVEL "os".
    	   		 *  **/
    	   		os = new FileOutputStream("/home/vanderson/git/JTunes - Parte I/JTunes - Parte I/" + nome + " - BOLETO.pdf");



    	try {
    			/**INICIAR A CRIAÇÃO DO PDF **/
    			PdfWriter.getInstance(doc, os);
			} 
    		
    		catch (DocumentException e1) 
    		{
    			e1.printStackTrace();
    		}
    			
    		doc.open();

    		/**PERMITE ESCREVER STRINGS NO PDF.
    		 * FOI CRIADO UM "CABEÇALHO" PARA IDENTIFICAR A LOJA JTUNES.
    		 * OS DEMAIS "DADOS" SÃO ADICIONADOS LOGO A SEGUIR DE MANEIRA SEMELHANTE A ARRAYS, POR EXEMPLO.
    		 * **/
    		Paragraph p = new Paragraph("JTunes - Transações Realizadas"
    									+ "\nRua do Java, Bairro Java. São Java." 
    									+  				"\n");
    		
    		p.add("=============================================================");
    		p.add("\nCliente: " + nome);
    		p.add("\nEmail: " + email);
    		p.add("\nEndereço: " + endereco);
    		p.add("\nTelefone: " + telefone);
    		p.add("\nCidade: " + cidade);
    		p.add("\nValor Total: " + valor);
    		
    		

        try
         
        {
			doc.add(p);
		} 
           catch (DocumentException e) {
			
			
			e.printStackTrace();
		}



       }
       
       finally 
       {
    	   /** FECHA O DOCUMENTO **/
           if (doc != null)
           {  
        	   doc.close();
           }

           /** FECHA O STREAM DE DADOS**/
           if (os != null) 
           {
              //fechamento da stream de saída
              os.close();

           }

       }
       
       /**INFORMA AO CLIENTE QUE TUDO OCORREU BEM E REDIRECIONA PARA A PÁGINA INICIAL. **/
       JOptionPane.showMessageDialog(null, "Compra Realizada Com Sucesso.");
       response.sendRedirect("index.html");

   }


}
