/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ITP1DAM
 */
public class AlumnosFaltas {
    
    private StringProperty nombreAlumno;
    private StringProperty asignatura;
    private StringProperty fecha;
    private StringProperty tipo;

    public AlumnosFaltas(String nombreAlumno, String asignatura, String fecha, String tipo) {
        this.nombreAlumno = new SimpleStringProperty(nombreAlumno);
        this.asignatura = new SimpleStringProperty(asignatura);
        this.fecha = new SimpleStringProperty(fecha);
        this.tipo = new SimpleStringProperty(tipo);
    }

    

    
    public StringProperty nombreAlumnoProperty() {
        return this.nombreAlumno;
    }
    public StringProperty asignaturaProperty(){
        return this.asignatura;
    }
    public StringProperty fechaProperty(){
        return this.fecha;
    }
    public StringProperty tipo(){
        return this.tipo;
    }

    public String getNombreAlumno() {
        return nombreAlumno.get();
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno.set(nombreAlumno);
    }

    public String getAsignatura() {
        return asignatura.get();
    }

    public void setAsignatura(String asignatura) {
        this.asignatura.set(asignatura);
    }

    public String getFecha() {
        return fecha.get();
    }

    public void setFecha(String fecha) {
        this.fecha.get();
    }

    public String getTipo() {
        return tipo.get();
    }

    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }

    
    
    
    
}
