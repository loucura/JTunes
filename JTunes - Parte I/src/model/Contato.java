package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;



public class Contato {

	private	Long cod;
	private	String nome;
	private	String email;
	private	String endereco;
	private	Calendar data_nascimento;

	
	// métodos get e set para id, nome, email, endereço e dataNascimento
	public String getNome() 
	{
		return this.nome;
	}
	
	public void setNome(String novo)
	{
		this.nome = novo;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String novo)
	{
		this.email = novo;
	}
	
	public String getEndereco() 
	{
		return this.endereco;
	}
	
	public void setEndereco(String novo) 
	{
		this.endereco = novo;
	}
	
	public Long getCod() 
	{
		
		return this.cod;
	}
	
	public void setCod(Long novo) 
	{
		this.cod = novo;
	}
	
	public Calendar getDataNascimento() 
	{
		return this.data_nascimento ;
	}
	
	public void setDataNascimento(Calendar data_nascimento ) 
	{
	
		this.data_nascimento = data_nascimento ;
	}
	
	
	public static void main(String[] args) throws SQLException
	{
		Connection con = new ConnectionFactory().getConnection();
		String SQL = "insert into Contatos" + " (nome,email,endereco,data_nascimento)" +	"values (?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(SQL);
		
		// preenchendo os valores no banco de dados
		stmt.setString(1, "Vanderson");
		stmt.setString(2, "contato@vanderson");
		stmt.setString(3, "Rua Sem Nome");

		//Gravando a data no banco de dados. Pode servir futuramente para detalhar compras...etc...
		java.sql.Date data = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
		stmt.setDate(4, data);
		
		//Executa os comandos no banco de dados
		stmt.execute();

		stmt.close();
		System.out.println("Dados Gravados com Sucesso!");
		con.close();

	
	
	
	}

	
//Fecha a classe
}
