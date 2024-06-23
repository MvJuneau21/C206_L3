import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TreinadorDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/pokemon";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public void adicionarTreinador(Treinador treinador) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO treinador (nomeTreinador, pokémonAceTreinador, idadeTreinador) VALUES (?, ?, ?)")) {
            stmt.setString(1, treinador.getNome());
            stmt.setString(2, treinador.getPokemonAce());
            stmt.setString(3, treinador.getIdade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarTreinador(String nomeTreinador) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM treinador WHERE nomeTreinador = ?")) {
            stmt.setString(1, nomeTreinador);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarTreinadores() {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM treinador")) {
            while (rs.next()) {
                System.out.println("Nome do Treinador: " + rs.getString("nomeTreinador"));
                System.out.println("Pokémon Ace do Treinador: " + rs.getString("pokémonAceTreinador"));
                System.out.println("Idade do Treinador: " + rs.getString("idadeTreinador"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarTreinador(Treinador treinador) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("UPDATE treinador SET pokémonAceTreinador = ?, idadeTreinador = ? WHERE nomeTreinador = ?")) {
            stmt.setString(1, treinador.getPokemonAce());
            stmt.setString(2, treinador.getIdade());
            stmt.setString(3, treinador.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
