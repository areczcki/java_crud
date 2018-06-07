package br.com.feltex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author alexandre.reczcki
 * 
 * @see Classe respons�vel pela Conex�o com o Banco de dados. � utilizada por outras
 * classes de persist�ncia de dados.
 *
 */
public class DAO {
	public Connection getConexao() {
		Connection conexao = null;
		String usuario = "root";
		String senha = "";
		String nomeBancoDados = "bdacademicnet";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			return DriverManager.getConnection("jdbc:mysql://localhost/" + nomeBancoDados, usuario, senha);
		
		}catch (SQLException sql) {
			sql.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}