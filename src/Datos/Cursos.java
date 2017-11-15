package Datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ITP1DAM
 */
public class Cursos {
    
    private final StringProperty nombre_curso;

    public Cursos(String nombre_curso) {
        this.nombre_curso = new SimpleStringProperty (nombre_curso); 
    }

    public StringProperty getNombre_curso() {
        return nombre_curso;
    }
    
    public void setNombre_curso(String nombre_curso)
    {
        this.nombre_curso.set(nombre_curso);
    }
    
}
