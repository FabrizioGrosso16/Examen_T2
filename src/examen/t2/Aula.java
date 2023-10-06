/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.t2;

/**
 *
 * @author User001
 */
public class Aula {

    private Alumno[] alumnos; 
    private String nombreClase;
    private int cantidadAlumnos;

    public Aula(String nombreClase) {
        this.nombreClase = nombreClase;
        this.alumnos = new Alumno[10]; 
        this.cantidadAlumnos = 0;
    }
   
}
