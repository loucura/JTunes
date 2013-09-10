package model;


import java.sql.SQLException;


/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE QUE MODELA UMA FORMA DE CONTATO E GRAVA OS 
 * DADOS REPASSADOS PELO FORMULÁRIO HTML NO BANCO DE DADOS.
 * 
 * */


public class Contato {

	private	int cod;
	private	String nome;
	private	String email;
	private	String endereco;
	private String empresa;
	private String telefone;
	private String mensagem;
	

	
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
	
	
	public String getEmpresa() 
	{
		return this.empresa;
	}
	
	public void setEmpresa(String novo) 
	{
		this.empresa = novo;
	}
	
	public String getTelefone() 
	{
		return this.telefone;
	}
	
	public void setTelefone(String novo) 
	{
		this.telefone = novo;
	}
	
	public String getMensagem() 
	{
		return this.mensagem;
	}
	
	public void setMensagem(String novo) 
	{
		this.mensagem = novo;
	}
	
	
	public int getCod() 
	{
		
		return this.cod;
	}
	
	public void setCod(int novo) 
	{
		this.cod = novo;
	}
	
		
	
	/**@deprecated
	 * MODELO INICIAL DE CONTATO E UMA FORMA DE TESTAR ANTES DE IMPLEMENTAR 
	 * EM UM SERVLET. NÃO TEM MAIS IMPORTÂNCIA NO PROJETO. 
	 * **/
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
