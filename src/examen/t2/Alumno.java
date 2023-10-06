/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.t2;

/**
 *
 * @author User001
 */
public class Alumno {

    public Alumno(String NombreA, String CodigoA) {
        this.NombreA = NombreA;
        this.CodigoA = CodigoA;
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    public String getCodigoA() {
        return CodigoA;
    }

    public void setCodigoA(String CodigoA) {
        this.CodigoA = CodigoA;
    }

    public boolean isAsitencia() {
        return Asitencia;
    }

    public void setAsitencia(boolean Asitencia) {
        this.Asitencia = Asitencia;
    }
    private String NombreA;
    private String CodigoA;
    private boolean Asitencia;
    
    public void MarcarAsistencia() {
        this.Asitencia = true; 
    }

    
}
