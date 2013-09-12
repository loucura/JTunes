package model;


import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 * JTunes - SISTEMA PARA VENDA DE MÚSICAS ONLINE SEMELHANTE AO ITUNES.
 * SERVLET CONTROLA COMPRA.
 *
 * @author VANDERSON DINIZ
 * @author ERICK SILVA
 * @version JTUNES 1.0 
 */


/**CLASSE FUNCIONÁRIO. RESPONSÁVEL POR IDEALIZAR UM FUNCIONÁRIO.
 * INICIALMENTE, O FUNCIONÁRIO NÃO HERDOU DADOS DE UM CLASSE DE INTERFACE.
 * PROPOSTA A SER IMPLEMENTADA NA VERSÃO JTUNES 2.0.
 * */

public class Funcionario {

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
	
	
	/**@deprecated
	 * MODELO INICIAL DE FUNCIONÁRIO E UMA FORMA DE TESTAR ANTES DE IMPLEMENTAR 
	 * EM UM SERVLET. NÃO TEM MAIS IMPORTÂNCIA NO PROJETO. 
	 * **/
	public static void main(String[] args) throws SQLException
	{
		
		
		//Gravar Contatos no Banco de Dados
		Funcionario func = new Funcionario();
		Usuario user = new Usuario();
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String nome,senha;
		
		System.out.println("É aqui que vai ler o nome para adicionar ao BD");
		nome = sc.nextLine();
		func.setNome(nome);
		
		System.out.println("E aqui a senha");
		senha = sc.nextLine();		
		func.setSenha(senha);
		
		//Grava a partir dessa Classe
		DAO bd;
		boolean resposta = false;
		try {
			bd = new DAO();
			resposta = bd.pesquisaFuncionario(func);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Chama a Classe DAO para a inserção dos dados no BD
		//bd.adicionaUsuario(user);
		
		//PESQUISA USUÁRIO NO BANCO DE DADOS
		//bd.pesquisaUsuario(user);		
		
		  
		if (resposta == true)
		{  
			
			JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso. Você Será Redirecionado."); 
		 
		}
			
		else
		
		{  
			
			JOptionPane.showMessageDialog(null, "Dados inválidos. Verifique Login e/ou Senha"); 
		 
		}
			
	}

	
//Fecha a classe
}
