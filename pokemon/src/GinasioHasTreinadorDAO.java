import java.sql.*;

public class GinasioHasTreinadorDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/pokemon";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public void adicionarGinasioHasTreinador(Ginasio_has_Treinador ginasioHasTreinador) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO ginásio_has_treinador (nomeTreinador, insigniaGinasio) VALUES (?, ?)")) {
            stmt.setString(1, ginasioHasTreinador.getNomeTreinador());
            stmt.setString(2, ginasioHasTreinador.getInsigniaGinasio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarGinasioHasTreinador(String nomeTreinador, String insigniaGinasio) {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM ginásio_has_treinador WHERE nomeTreinador = ? AND insigniaGinasio = ?")) {
            stmt.setString(1, nomeTreinador);
            stmt.setString(2, insigniaGinasio);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarGinasioHasTreinador() {
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM ginásio_has_treinador")) {
            while (rs.next()) {
                System.out.println("Nome do Treinador: " + rs.getString("nomeTreinador"));
                System.out.println("Insígnia do Ginásio: " + rs.getString("insigniaGinasio"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
