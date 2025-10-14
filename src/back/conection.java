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
    private static final String URL = "jdbc:mysql://localhost:3306/calculadora_db";
    private static final String USER = "root";  // tu usuario de MySQL
    private static final String PASS = "JoseD2025!**"; // tu contraseña de MySQL

    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa a MySQL");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Conexión fallida");
        }
        return con;
    }
    
}
