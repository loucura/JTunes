package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Funcionario;
import controller.Usuario;

public class DAO {
	
	// a conexão com o banco de dados
	private Connection connection;
	
	
	public DAO() 
	{
		this.connection = new ConnectionFactory().getConnection();
	
	}
	
	//ADICIONA CONTATO NO BANCO DE DADOS
	public void adicionaContato(Contato contato) {String sql = "insert into Contatos " 
	//+ contato.getNome() + contato.getEmail() + contato.getEndereco() + " values (?,?,?,?)";
	+ "(nome,email,endereco)" + "values (?,?,?)"; 
	
		try 
		{
			//Preparando para a Inserção de Dados
			Connection con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			
					
			// seta os valores
			stmt.setString(1,contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			System.out.println("Dados Gravados com Sucesso!");
			
			//Executa no Banco de Dados
			stmt.execute();
			//Fecha a Conexão
			stmt.close();
			
		
		} 
			
		catch (SQLException e) 
			{
				throw new RuntimeException(e);
			}
		
	}

	//PESQUISA CONTATO NO BANCO DE DADOS
	public void pesquisaContato(Contato contato) 
	{
				try 
				{
					//Preparando para a Inserção de Dados
					Connection con = new ConnectionFactory().getConnection();
					PreparedStatement stmt = con.prepareStatement("select * from Contatos");
					
					//Executa no Banco de Dados
					ResultSet rs = stmt.executeQuery();
					
					//Enquanto...
					while (rs.next()) 
					{
						String nome = rs.getString("nome");
						String email = rs.getString("email");
						String endereco = rs.getString("endereco");
						System.out.println(nome + " :: " + email + "::" + endereco);						
					}
					
					rs.close();
					stmt.close();
					con.close();
				} 
					
				catch (SQLException e) 
					{
						throw new RuntimeException(e);
					}
				
			}
	
	
	//REMOVE CONTATO PASSANDO O CÓDIGO OU ID
	public void removeContato(Contato contato) {
			
			try {
					
					PreparedStatement stmt = connection.prepareStatement("delete from Contatos where Cod=?");
					stmt.setLong(1, contato.getCod());
					stmt.execute();

					stmt.close();
				} 
			
				catch (SQLException e) 
				{
					
					throw new RuntimeException(e);
				}
	

	}

	
	
	//ADICIONA USUÁRIO NO BANCO DE DADOS	
	public void adicionaUsuario(Usuario usuario) {String sql = "insert into Usuarios " +"(nome,senha)" + " values (?,?)";
				
	
			try 
				{
					//Preparando para a Inserção de Dados
					Connection con = new ConnectionFactory().getConnection();
					PreparedStatement stmt = con.prepareStatement(sql);
					
									
					// seta os valores
					stmt.setString(1,usuario.getNome());
					stmt.setString(2,usuario.getSenha());
					
					System.out.println("Dados Gravados com Sucesso!");
					
					//Executa no Banco de Dados
					stmt.execute();
					//Fecha a Conexão
					stmt.close();
			
				} 
					
				catch (SQLException e) 
					{
						throw new RuntimeException(e);
					}
				
			}
	
	
	//PESQUISA USUÁRIO NO BANCO DE DADOS
	public void pesquisaUsuario(Usuario usuario) 
	{
				try 
				{
					//Preparando para a Inserção de Dados
					Connection con = new ConnectionFactory().getConnection();
					PreparedStatement stmt = con.prepareStatement("select * from Usuarios");
					
					
					
					//Executa no Banco de Dados
					ResultSet rs = stmt.executeQuery();
					
					//Enquanto...
					while (rs.next()) 
					{
						String nome = rs.getString("nome");
						String senha = rs.getString("senha");
						
						System.out.println(nome + " :: " + senha);						
					}
					
					rs.close();
					stmt.close();
					con.close();
				} 
					
				catch (SQLException e) 
					{
						throw new RuntimeException(e);
					}
				
			}
	
	
	//ADICIONA FUNCIONÁRIO NO BANCO DE DADOS	
	public void adicionaFuncionario(Funcionario funcionario) {String sql = "insert into Funcionarios " +"(nome,senha)" + " values (?,?)";
	try 
	{
		//Preparando para a Inserção de Dados
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		
		// seta os valores
		stmt.setString(1,funcionario.getNome());
		stmt.setString(2,funcionario.getSenha());
		
		System.out.println("Dados Gravados com Sucesso!");
		
		//Executa no Banco de Dados
		stmt.execute();
		//Fecha a Conexão
		stmt.close();

	} 
		
	catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
		
}
	
	
			//PESQUISA FUNCIONÁRIO NO BANCO DE DADOS
			public void pesquisaFuncionario(Funcionario funcionario) 
				{
						try 
						{
							//Preparando para a Inserção de Dados
							Connection con = new ConnectionFactory().getConnection();
							PreparedStatement stmt = con.prepareStatement("select * from Funcionarios");
							
							//Executa no Banco de Dados
							ResultSet rs = stmt.executeQuery();
							
							//Enquanto...
							while (rs.next()) 
							{
								String nome = rs.getString("nome");
								String senha = rs.getString("senha");
								
								System.out.println(nome + " :: " + senha);						
							}
							
							rs.close();
							stmt.close();
							con.close();
						} 
							
						catch (SQLException e) 
							{
								throw new RuntimeException(e);
							}
						
					}
	
	
	
	
	
}
