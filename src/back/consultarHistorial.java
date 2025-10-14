package back;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author JoseD
 */
public class consultarHistorial {

    public static String obtenerHistorial() {
        StringBuilder texto = new StringBuilder();
        String sql = "SELECT * FROM historial";

        try (Connection con = conection.conectar(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                texto.append(rs.getInt("id"))
                        .append(" | ")
                        .append(rs.getString("operacion"))
                        .append(" | ")
                        .append(rs.getString("fecha"))
                        .append("\n");
            }

        } catch (Exception e) {
            texto.append("Error al consultar: ").append(e.getMessage());
        }

        return texto.toString();
    }
}
