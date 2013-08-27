package model;


import java.sql.SQLException;




public class Contato {

	private	int cod;
	private	String nome;
	private	String email;
	private	String endereco;
	

	
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
	
	public int getCod() 
	{
		
		return this.cod;
	}
	
	public void setCod(int novo) 
	{
		this.cod = novo;
	}
	
		
	
	public static void main(String[] args) throws SQLException
	{
		//Gravar Contatos no Banco de Dados
		Contato contato = new Contato();
		contato.setNome("Teste");
		contato.setEmail("testando@mail.com	");
		contato.setEndereco("Rua");
		
		//Grava a partir dessa Classe
		DAO bd = new DAO();
		//Chama a Classe DAO para a inserção dos dados no BD
		bd.adicionaContato(contato);
		
		//Pesquisa um contato no banco de dados
		//bd.pesquisaContato(contato);
		
		//REMOVE CONTATO
		//bd.removeContato(contato);
	
	}
//Fecha a classe
}
