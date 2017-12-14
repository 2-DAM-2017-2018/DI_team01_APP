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
    
    private StringProperty todo; 

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
    
}
