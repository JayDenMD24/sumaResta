/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JoseD
 */
public class conection {
private static final String URL = "jdbc:sqlite:src/database/calculadora_db.db";

    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL);
            System.out.println("Conexión exitosa a MySQL");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Conexión fallida");
        }
        return con;
    }
    
}
