package executConsult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5434/BIproducao";  // Correção da URL do banco de dados
        String user = "postgres";
        String password = "postgres";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Conectar ao banco de dados
            connection = DriverManager.getConnection(url, user, password);  // Correção na chamada do método
            statement = connection.createStatement();

            // Executar consulta
            String query = "SELECT * FROM clientes";
            resultSet = statement.executeQuery(query);

            // Processar resultados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                String dataNascimento = resultSet.getString("data_nascimento");

                System.out.printf("ID: %d, Nome: %s, Email: %s, Data de Nascimento: %s%n", id, nome, email, dataNascimento);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
