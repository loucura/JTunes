package model;


import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.pipe.NextAction;



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
	
	
	
//Fecha a classe
}
