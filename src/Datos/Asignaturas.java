/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ITP1DAM
 */
public class Asignaturas 
{
    private StringProperty nombreAsignaturas;
 
    public Asignaturas (String nombreAsignaturas){
        this.nombreAsignaturas = new SimpleStringProperty(nombreAsignaturas);
        
    }
    public String getNombreAsignaturas()
    {
        return nombreAsignaturas.get();
    }
    
    public void setNombreAsignaturas(String todo) {
        this.nombreAsignaturas.set(todo);
    }

    public StringProperty nombreAsignaturasProperty() {
        return nombreAsignaturas;
    }
    
}
