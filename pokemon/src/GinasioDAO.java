import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GinasioDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/pokemon";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public void adicionarGinasio(Ginasio ginasio) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO ginásio (tipoGinásio, insigniaGinasio, Lider_nomeLider, Cidade_nomeCidade) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, ginasio.getTipoGinasio());
            stmt.setString(2, ginasio.getInsigniaGinasio());
            stmt.setString(3, ginasio.getLiderNomeLider());
            stmt.setString(4, ginasio.getCidadeNomeCidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarGinasio(String insigniaGinasio) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM ginásio WHERE insigniaGinásio = ?")) {
            stmt.setString(1, insigniaGinasio);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarGinasios() {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM ginásio")) {
            while (rs.next()) {
                System.out.println("Tipo do Ginásio: " + rs.getString("tipoGinásio"));
                System.out.println("Insignia do Ginásio: " + rs.getString("insigniaGinasio"));
                System.out.println("Nome do Líder: " + rs.getString("Lider_nomeLider"));
                System.out.println("Nome da Cidade: " + rs.getString("Cidade_nomeCidade"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarGinasio(Ginasio ginasio) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("UPDATE ginásio SET tipoGinásio = ?, Lider_nomeLider = ?, Cidade_nomeCidade = ? WHERE insigniaGinasio = ?")) {
            stmt.setString(1, ginasio.getTipoGinasio());
            stmt.setString(2, ginasio.getLiderNomeLider());
            stmt.setString(3, ginasio.getCidadeNomeCidade());
            stmt.setString(4, ginasio.getInsigniaGinasio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void listarTreinadoresDoGinasio(String insigniaGinasio) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("SELECT Treinador_nomeTreinador FROM Ginásio_has_Treinador WHERE Ginásio_insigniaGinasio = ?")) {
            stmt.setString(1, insigniaGinasio);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Nome do Treinador do Ginásio: " + rs.getString("Treinador_nomeTreinador"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void adicionarTreinadorNoGinasio(Ginasio_has_Treinador ginasioTreinador) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Ginásio_has_Treinador (Ginásio_insigniaGinasio, Treinador_nomeTreinador) VALUES (?, ?)")) {
            stmt.setString(1, ginasioTreinador.getInsigniaGinasio());
            stmt.setString(2, ginasioTreinador.getNomeTreinador());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void removerTreinadorDoGinasio(String nomeTreinador, String insigniaGinasio) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM Ginásio_has_Treinador WHERE Treinador_nomeTreinador = ? AND Ginasio_insigniaGinasio = ?")) {
            stmt.setString(1, nomeTreinador);
            stmt.setString(2, insigniaGinasio);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
