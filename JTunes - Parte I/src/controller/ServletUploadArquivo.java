package controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

//import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.tomcat.util.http.fileupload.FileItemFactory;
//import org.apache.tomcat.util.http.fileupload.RequestContext;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;







import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import model.DAO;
import model.Mp3;


public class ServletUploadArquivo extends HttpServlet {

	private static final long serialVersionUID = -3313174925443786914L;
	 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException{
    	System.out.println("flag 1");
        boolean isMultipart = ServletFileUpload.isMultipartContent(req);
        
        if(isMultipart) {
        	
            try {
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                
//                HashMap<String,List<FileItem>> mapa =  (HashMap<String, List<FileItem>>) upload.parseParameterMap(req);
                
                RequestContext rc = new ServletRequestContext(req);
//                List<FileItem> items = mapa.get( mapa.keySet().iterator().next() );
                List<FileItem> items = (List<FileItem>) upload.parseRequest(rc);
                Mp3 musica = new Mp3();
                
                System.out.println("flag");
                
                for(FileItem item : items) {
                    if(item.isFormField()) {
                        //se for um campo normal de form
                        
                        if( item.getFieldName().compareToIgnoreCase("nome") == 0 ) {
                        	
                        	musica.setNome(item.getString());
                        }
                        if( item.getFieldName().compareToIgnoreCase("genero") == 0 ) {
                        	musica.setGenero(item.getString());
                        }
                        if( item.getFieldName().compareToIgnoreCase("valor") == 0 ) {
                        	musica.setPreco( item.getString());
                        }
                        
                    } else {
                        //caso seja um campo do tipo file
                        File uploadedFile = new File("/home/vanderson/Downloads/" + item.getName());
                        musica.setCaminho(uploadedFile.getAbsolutePath());
                        item.write(uploadedFile);
                    }
                    
                }
                
                DAO bd;
        		bd = new DAO();
				bd.adicionaMP3(musica);
				
				response.sendRedirect("index.html");
                
            } catch (Exception e) {
            	//response.getWriter().println("ocorreu um problema ao fazer o upload: " + e.getMessage() + "\n" + e.getStackTrace());
            	e.printStackTrace();
            }
 
        }
    }
}