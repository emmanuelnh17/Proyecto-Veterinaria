package com.mycompany.veterinaria;
import view.Menu_view;
/**
 *
 * @author yecum
 */
/**
 * La clase Veterinaria contiene el método principal para iniciar la aplicación de la veterinaria.
 */
public class Veterinaria {

    /**
     * El método principal que inicia la aplicación de la veterinaria.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia de la interfaz de usuario Menu_view
        Menu_view m = new Menu_view();

        // Hacer visible la interfaz de usuario
        m.setVisible(true);

        // Configurar la ubicación de la interfaz de usuario en el centro de la pantalla
        m.setLocationRelativeTo(null);
    }
}
