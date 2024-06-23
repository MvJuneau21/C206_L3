import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CidadeDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/pokemon";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public void adicionarCidade(Cidade cidade) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO cidade (nomeCidade, regiãoCidade, populaçãoCidade) VALUES (?, ?, ?)")) {
            stmt.setString(1, cidade.getNomeCidade());
            stmt.setString(2, cidade.getRegiaoCidade());
            stmt.setInt(3, cidade.getPopulacaoCidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarCidade(String nomeCidade) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM cidade WHERE nomeCidade = ?")) {
            stmt.setString(1, nomeCidade);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarCidades() {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM cidade")) {
            while (rs.next()) {
                System.out.println("Nome da Cidade: " + rs.getString("nomeCidade"));
                System.out.println("Região da Cidade: " + rs.getString("regiãoCidade"));
                System.out.println("População da Cidade: " + rs.getInt("populaçãoCidade"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarCidade(Cidade cidade) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("UPDATE cidade SET regiãoCidade = ?, populaçãoCidade = ? WHERE nomeCidade = ?")) {
            stmt.setString(1, cidade.getRegiaoCidade());
            stmt.setInt(2, cidade.getPopulacaoCidade());
            stmt.setString(3, cidade.getNomeCidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}