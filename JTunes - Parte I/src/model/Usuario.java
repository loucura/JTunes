package model;


import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import controller.ServletAdicionaUsuario;




/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE USUÁRIO. RESPONSÁVEL POR IDEALIZAR UM USUÁRIO.
 * INICIALMENTE, O USUÁRIO NÃO HERDOU DADOS DE UMA CLASSE DE INTERFACE.
 * PROPOSTA A SER IMPLEMENTADA NA VERSÃO JTUNES 2.0.
 * */


public class Usuario {

	private	Long cod;
	private	String nome;
	private	String senha;
	private String cpf;

	
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public void setNome(String novo)  
	{
		this.nome = novo;
	}

	
	public Long getCod() 
	{
		
		return this.cod;
	}
	
	public void setCod(Long novo) 
	{
		this.cod = novo;
	}
	
	public String getSenha() 
	{
		
		return this.senha;
	}
	
	public void setSenha(String nova_senha) 
	{
		this.senha = nova_senha;
	}
	
	
	public String getCPF() 
	{
		
		return this.cpf;
	}
	
	public void setCPF(String cpf) 
	{
		this.cpf = cpf;
	}
	
	
	
	/**EM CONSTRUÇÃO.
	 * PERMITE VALIDAR OS CAMPOS DE FORMULÁRIO REPASSADOS
	 * A UM SERVLET. NESTE CASO, SE O CAMPO NOME NÃO FOR PREENCHIDO,
	 * É FORNECIDA UMA MENSAGEM AO USUÁRIO IMPOSSIBILITANDO-O DE CONTINUAR,
	 * CASO NÃO PREENCHA O NOME.
	 * **/
	public boolean VerificaNome(String name) 
	{
		if (name.equals(""))
		{
			return false;
		}
	    	    
	    else
	    {
	    	this.nome = name;
			return true;
	    		
	    }
			
	}
	
	
	/**EM CONSTRUÇÃO.
	 * PERMITE VALIDAR OS CAMPOS DE FORMULÁRIO REPASSADOS
	 * A UM SERVLET. NESTE CASO, SE O CAMPO SENHA NÃO FOR PREENCHIDO,
	 * É FORNECIDA UMA MENSAGEM AO USUÁRIO IMPOSSIBILITANDO-O DE CONTINUAR,
	 * CASO NÃO PREENCHA O CAMPO SENHA.
	 * **/
	public boolean VerificaSenha(String pass) 
	{
		if (pass.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Senha em Branco" );
			return false;
		}
	    	    
	    else
	    {
	    	this.senha = pass;
			return true;
	    		
	    }	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
//Fecha a classe
}
