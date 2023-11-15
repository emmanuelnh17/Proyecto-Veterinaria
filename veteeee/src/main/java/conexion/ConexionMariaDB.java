/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * La clase ConexionMariaDB proporciona métodos para establecer y obtener la conexión a la base de datos MariaDB.
 */
public class ConexionMariaDB {

    // Objeto de conexión a la base de datos
    Connection con;

    /**
     * Constructor de la clase que establece la conexión a la base de datos MariaDB.
     * Se utiliza el controlador JDBC para establecer la conexión con la base de datos.
     */
    public ConexionMariaDB() {
        // URL de conexión a la base de datos
        String sURL = "jdbc:mariadb://localhost:3307/animales";
        
        try {
            // Establecer la conexión utilizando el controlador JDBC de MariaDB
            con = DriverManager.getConnection(sURL, "root", "123456");
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.toString());
        }
    }

    /**
     * Método para obtener la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */
    public Connection getCon() {
        return con;
    }
}


