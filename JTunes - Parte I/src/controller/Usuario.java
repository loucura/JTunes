package controller;


import java.sql.SQLException;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import model.DAO;



public class Usuario {

	private	Long cod;
	private	String nome;
	private	String senha;

	
	
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
		
	
	public static void main(String[] args) throws SQLException
	{
		
		
		//Gravar Contatos no Banco de Dados
		Usuario user = new Usuario();
		
		Scanner sc = new Scanner(System.in);
		String nome,senha;
		
		System.out.println("É aqui que vai ler o nome para adicionar ao BD");
		nome = sc.nextLine();
		user.setNome(nome);
		
		System.out.println("E aqui a senha");
		senha = sc.nextLine();		
		user.setSenha(senha);
		
		//Grava a partir dessa Classe
		DAO bd = new DAO();
		//Chama a Classe DAO para a inserção dos dados no BD
		bd.adicionaUsuario(user);
		
		
		//PESQUISA USUÁRIO NO BANCO DE DADOS
		bd.pesquisaUsuario(user);
		
			
	}

	
//Fecha a classe
}
