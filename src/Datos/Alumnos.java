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
public class Alumnos {
    
    private final StringProperty nombre;
    private final StringProperty apellidos;

    
    public Alumnos(String nombre, String apellidos) {
        this.nombre = new SimpleStringProperty (nombre);
        this.apellidos = new SimpleStringProperty (apellidos);
    }

    public StringProperty getNombre() {
        return nombre;
    }

    public StringProperty getApellidos() {
        return apellidos;
    }
    
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos.set(apellidos);
    }
}
