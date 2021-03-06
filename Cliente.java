package org.umg.curso;

/**
 * Created by alumno on 26/06/2017.
 */
public class Cliente {
    // atributos
    private String nombre;
    private int edad;
    private float salario;

    // constuctor vacio
    public Cliente() {
    }

    // constructor click derecho generate Constructor
    public Cliente(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // get an set click derecho generate Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
