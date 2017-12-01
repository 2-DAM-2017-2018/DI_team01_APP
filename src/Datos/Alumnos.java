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
    
//    private final StringProperty nombre;
//    private final StringProperty apellidos;
//    private final StringProperty curso;
    private StringProperty todo; 

    
    /*public Alumnos(String nombre, String apellidos, String curso) {
        this.nombre = new SimpleStringProperty (nombre);
        this.apellidos = new SimpleStringProperty (apellidos);
        this.curso = new SimpleStringProperty (curso);
        this.todo = new SimpleStringProperty("Manolo Muñoz 2ºDam");
    }*/
    public Alumnos(String todo)
    {
        this.todo=new SimpleStringProperty(todo);
    }
    
    public String getTodo()
    {
        return todo.get();
    }
    
    public void setTodo(String todo) {
        this.todo.set(todo);
    }

    public StringProperty todoProperty() {
        return todo;
    }

//    public StringProperty getNombre() {
//        return nombre;
//    }
//
//    public StringProperty getApellidos() {
//        return apellidos;
//    }
//    
//    public StringProperty getCurso() {
//        return curso;
//    }
//    
//    public void setNombre(String nombre) {
//        this.nombre.set(nombre);
//    }
//    
//    public void setApellidos(String apellidos) {
//        this.apellidos.set(apellidos);
//    }
//    
//    public void setCurso(String curso) {
//        this.curso.set(curso);
//    }
//    
}
