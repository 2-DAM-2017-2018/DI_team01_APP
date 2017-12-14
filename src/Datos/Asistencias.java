package Datos;


import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITP1DAM
 */
public class Asistencias {
    
    private final BooleanProperty haFaltado;
    private final BooleanProperty haAsistido;
    private final StringProperty fecha;

     public Asistencias(Boolean haFaltado, Boolean haAsistido, String fecha) {
        this.haFaltado = new SimpleBooleanProperty (haFaltado); 
        this.haAsistido = new SimpleBooleanProperty (haAsistido); 
        this.fecha = new SimpleStringProperty (fecha); 
    }

    public BooleanProperty getHaFaltado() {
        return haFaltado;
    }

    public BooleanProperty getHaAsistido() {
        return haAsistido;
    }

    public StringProperty getFecha() {
        return fecha;
    }
     
    public void setHaFaltado(Boolean haFaltado){
        this.haFaltado.set(haFaltado);
    }
    
    public void setHaAsistido(Boolean haAsistido){
        this.haAsistido.set(haAsistido);
    }
    
    public void setFecha(String fecha){
        this.fecha.set(fecha);
    } 
}
