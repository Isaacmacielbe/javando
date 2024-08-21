package conectbanc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/exercicios";
		String user = "postgres";
		String password = "postgres";
		
		try {
			//Carregando o drive
			Class.forName("org.postgres.Driver");
			
			//Conectar ao banco de dados
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso!");
			
			//Fechando a conexão
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
