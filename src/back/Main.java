/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;
// ESTE ES UN MENSAJE DE PRUEBA
import front.MenuPrincipal;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

/**
 *
 * @author JoseD
 */
public class Main {

    public static void main(String[] args) {
        FlatMacDarkLaf.setup();

        MenuPrincipal mp = new MenuPrincipal();
        mp.setLocationRelativeTo(null);
        mp.setVisible(true);
    }
}
