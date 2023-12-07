package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionQuejas {

    // Establece la conexión con la base de datos
    public static Connection conectar() {
        Connection conexion = null;

        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/Registroresidentes", "root", "durtecks");
            System.out.println("Conexión exitosa");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    // Inserta una queja o sugerencia en la base de datos
    public static void insertarQuejaSugerencia(String tipo, String asunto, String mensaje) {
        try (Connection conexion = conectar()) {
            String consulta = "INSERT INTO tabla_quejas_sugerencias (tipo, asunto, mensaje) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
                pstmt.setString(1, tipo);
                pstmt.setString(2, asunto);
                pstmt.setString(3, mensaje);

                pstmt.executeUpdate();
                System.out.println("Queja o sugerencia registrada con éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
