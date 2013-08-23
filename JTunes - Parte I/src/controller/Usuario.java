package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

import model.ConnectionFactory;



public class Usuario {

	private	Long cod;
	private	String nome;
	private	Long senha;

	
	// métodos get e set para id, nome, email, endereço e dataNascimento
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
	
	public Long getSenha() 
	{
		
		return this.senha;
	}
	
	public void setSenha(Long nova_senha) 
	{
		this.senha = nova_senha;
	}
		
	
	public static void main(String[] args) throws SQLException
	{
		Connection con = new ConnectionFactory().getConnection();
		String SQL = "insert into Usuarios" + " (nome,senha)" +	"values (?,?)";
		PreparedStatement stmt = con.prepareStatement(SQL);
		
				
		// preenchendo os valores no banco de dados
		stmt.setString(1, "vanderson");
		stmt.setString(2, "123456");
		
		//Executa os comandos no banco de dados
		stmt.execute();

		stmt.close();
		System.out.println("Dados Gravados com Sucesso!");
		con.close();

	
	
	
	}

	
//Fecha a classe
}
