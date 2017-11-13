/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador.Ventana1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author ITP1DAM
 */
public class Ventana1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    private ArrayList <String> cursos;
    private ArrayList <String> alumnos;
    private ArrayList <String> fecha;

    public Ventana1Controller() {
        ArrayList<String> cursos = new ArrayList<>();
        ArrayList<String> alumnos = new ArrayList<>();
        ArrayList <String> fecha = new ArrayList<>();
        
    }

    public Ventana1Controller(ArrayList<String> cursos, ArrayList<String> alumnos, ArrayList<String> fecha) {
        this.cursos = cursos;
        this.alumnos = alumnos;
        this.fecha = fecha;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<String> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<String> getFecha() {
        return fecha;
    }

    public void setFecha(ArrayList<String> fecha) {
        this.fecha = fecha;
    }
}
