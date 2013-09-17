package model;

/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE QUE IDEALIZA UMA COMPRA E OS DADOS 
 * NECESSÁRIOS PARA A SUA REALIZAÇÃO.
 * OS PARÂMETROS @param NOME, EMAIL, ENDEREÇO, TELEFONE E CIDADE,
 * REFEREM-SE AO CLIENTE E DEVEM SER ENTENDIDOS COMO UMA FORMA DE CONTATO.
 * OS PARÂMETROS @param QUANTIDADE E VALOR, DIZEM RESPEITO AOS ITENS MP3.
 * */



public class Compra {
	
	private String nome;
	private String email;
	private String endereco;
	private String telefone;
	private String cidade;
	private long quantidade;
	private String valor;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	
	public String getTelefone()
	{
		return telefone;
	}
	
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	
	public String getCidade() 
	{
		return cidade;
	}
	
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	
	public void setQuantidade(long quantidade)
	{
		this.quantidade = quantidade;
		
	}
	
	public long getQuantidade()
	{
		return quantidade;		
	}
	
	
	
	public String getValor() 
	{
		return valor;
	}
	
	public void setValor(String valor) 
	{
		this.valor = valor;
	}
	

}
