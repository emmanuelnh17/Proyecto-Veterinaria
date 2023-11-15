/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Animal;

import view.Animal_view;
import view.Menu_view;
import conexion.ConexionMariaDB;

/**
 *
 * @author yecum */
import java.util.ArrayList;

/**
 * La clase Controlador actúa como el controlador principal de la aplicación.
 */
public class Controlador {

    // Instancias de vistas y modelo
    Animal_view av;
    Animal an;

    // Lista de animales
    private ArrayList<Animal> animales;

    // Instancia única del controlador (patrón Singleton)
    private static Controlador instancia;

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia del controlador
        Controlador c = new Controlador();

        // Crear una instancia de la clase de conexión a la base de datos
        ConexionMariaDB cx = new ConexionMariaDB();
        cx.getCon(); // Obtener la conexión

        // Crear e iniciar la vista del menú principal
        Menu_view m = new Menu_view();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }

    /**
     * Constructor de la clase Controlador.
     * Inicializa instancias de vistas y modelos necesarios.
     */
    public Controlador() {
        av = new Animal_view();
        animales = new ArrayList<>();
        // Puedes inicializar más instancias aquí según sea necesario
    }
}

    
    
    
    

