/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop1;

/**
 *
 * @author fasan
 */
public class Estudiante {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double nota;
    private String estadoExamen;
    //Crear constructores
    public Estudiante() {
        
    }
    
    public Estudiante(String nombre, String apellido, int edad, double nota, String estadoExamen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
        this.estadoExamen = estadoExamen;
    }
    
    //Getters and setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getEstadoExamen() {
        return estadoExamen;
    }

    public void setEstadoExamen(String estadoExamen) {
        this.estadoExamen = estadoExamen;
    }
    
    //Crear metodo de retornar todo los datos a String
    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()
               + "\nNota: "+getNota()+"\nEstado de Examen: "+getEstadoExamen();
    }
    
}
