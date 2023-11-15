/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yecum
 */

    
/**
 * La clase Animal representa a un animal en la aplicación de la veterinaria.
 */
public class Animal {
    
    private int id;
    private String nombre;
    private String especie;
    private String edad;
    private String raza;
    private String fechaIngreso;

    /**
     * Constructor para inicializar un objeto Animal con información completa.
     *
     * @param id Identificador único del animal.
     * @param nombre Nombre del animal.
     * @param especie Especie a la que pertenece el animal.
     * @param edad Edad del animal.
     * @param raza Raza del animal.
     * @param fechaIngreso Fecha de ingreso del animal a la veterinaria.
     */
    public Animal(int id, String nombre, String especie, String edad, String raza, String fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Constructor por defecto para crear un objeto Animal sin información inicial.
     */
    public Animal() {
        // Puedes agregar lógica adicional si es necesario
    }

    /**
     * Representación en cadena del objeto Animal.
     *
     * @return Una cadena que representa el objeto Animal.
     */
    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    /**
     * Obtiene la fecha de ingreso del animal.
     *
     * @return La fecha de ingreso del animal.
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Establece la fecha de ingreso del animal.
     *
     * @param fechaIngreso La nueva fecha de ingreso del animal.
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // Los métodos getter y setter para otras propiedades del animal




    
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}


    
