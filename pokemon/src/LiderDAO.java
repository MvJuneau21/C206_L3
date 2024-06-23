import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LiderDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/pokemon";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public void adicionarLider(Lider lider) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO lider (nomeLider, pokémonAce, idadeLider, Cidade_nomeCidade) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, lider.getNome());
            stmt.setString(2, lider.getPokemonAce());
            stmt.setString(3, lider.getIdade());
            stmt.setString(4, lider.getNomeCidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarLider(String nomeLider) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM lider WHERE nomeLider = ?")) {
            stmt.setString(1, nomeLider);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarLideres() {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM lider")) {
            while (rs.next()) {
                System.out.println("Nome do Líder: " + rs.getString("nomeLider"));
                System.out.println("Pokémon Ace: " + rs.getString("pokémonAce"));
                System.out.println("Idade do Líder: " + rs.getString("idadeLider"));
                System.out.println("Nome da Cidade: " + rs.getString("Cidade_nomeCidade"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarLider(Lider lider) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("UPDATE lider SET pokémonAce = ?, idadeLider = ?, Cidade_nomeCidade = ? WHERE nomeLider = ?")) {
            stmt.setString(1, lider.getPokemonAce());
            stmt.setString(2, lider.getIdade());
            stmt.setString(3, lider.getNomeCidade());
            stmt.setString(4, lider.getNome());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}