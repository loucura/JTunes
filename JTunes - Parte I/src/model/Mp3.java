package model;


/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE MP3. RESPONSÁVEL POR IDEALIZAR UM ARQUIVO MP3 E OS CAMPOS QUE TORNEM POSSÍVEL
 * SUA IDENTIFICAÇÃO, PREÇO E GÊNERO, ALÉM DA LOCALIZAÇÃO DO ARQUIVO NO SERVIDOR.
 * 
 * */


public class Mp3 {

	private	Long cod;
	private	String nome;
	private	String preco;
	private	String genero;
	private	String caminho;

	
	
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
	
	public String getPreco() 
	{
		
		return this.preco;
	}
	
	public void setPreco(String novo_preco) 
	{
		this.preco = novo_preco;
	}
	
	public String getGenero() 
	{
		
		return this.genero;
	}
	
	public void setGenero(String novo_genero) 
	{
		this.genero = novo_genero;
	}
	
	public String getCaminho() 
	{
		
		return this.caminho;
	}
	
	public void setCaminho(String novo_caminho) 
	{
		this.caminho = novo_caminho;
	}
	
	
	
	
	
	
//Fecha a classe
}
