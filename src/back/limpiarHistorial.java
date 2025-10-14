package back;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author JoseD
 */
public class limpiarHistorial {

    public static void borrarTodo() {
        String sql = "DELETE FROM historial";

        try (Connection con = conection.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error al limpiar historial: " + e.getMessage());
        }
    }
}
