package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

import model.ConnectionFactory;
import model.DAO;



public class Funcionario {

	private	Long cod_fun;
	private	String nome_fun;
	private	String senha_fun;

	
	
	public String getNome() 
	{
		return this.nome_fun;
	}
	
	public void setNome(String novo)
	{
		this.nome_fun = novo;
	}
		
	public Long getCod() 
	{
		
		return this.cod_fun;
	}
	
	public void setCod(Long novo) 
	{
		this.cod_fun = novo;
	}
	
	public String getSenha() 
	{
		
		return this.senha_fun;
	}
	
	public void setSenha(String nova_senha) 
	{
		this.senha_fun = nova_senha;
	}
		
	
	public static void main(String[] args) throws SQLException
	{
		//Gravar Contatos no Banco de Dados
		Funcionario funcionario = new Funcionario();
				
		funcionario.setNome("funcionario1");
		funcionario.setSenha("123senha");
		
		//Grava a partir dessa Classe
		DAO bd = new DAO();
		//Chama a Classe DAO para a inserção dos dados no BD
		bd.adicionaFuncionario(funcionario);
		
		
		bd.pesquisaFuncionario(funcionario);
		
		
	
	}

	
//Fecha a classe
}
