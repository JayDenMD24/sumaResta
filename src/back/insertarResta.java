/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JoseD
 */
public class insertarResta {
      public void guardarOperacion(String operacion) {
        String sql = "INSERT INTO historial (operacion) VALUES (?)";
        
        try (Connection con = conection.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, operacion);
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
        }
    }
}

