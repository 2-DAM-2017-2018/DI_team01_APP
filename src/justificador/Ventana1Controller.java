/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador;

import Datos.Alumnos;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author ITP1DAM
 */



public class Ventana1Controller implements Initializable {

    private Justificador mainApp;
    private ArrayList<Alumnos> personas;
    @FXML
    private TableView tabla;
    private static ObservableList<Alumnos> alumnos = FXCollections.observableArrayList();

     
   

    @FXML 
    private TableColumn <Alumnos, String> nombre_cursosAlumnos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

        Alumnos a1 = new Alumnos("Alejandro Ariza 2ºDAM");
        Alumnos a2 = new Alumnos("Felipe Perez 2ºDAM");
        Alumnos a3 = new Alumnos("Dani Muñoz 2ºDAM");
        Alumnos a4 = new Alumnos("Pedro Martin 2ºDAM");
        Alumnos a5 = new Alumnos("Ismael Castañeda 2ºDAM");
        Alumnos a6 = new Alumnos("Pepe Perez 2ºDAM");
        Alumnos a7 = new Alumnos("Francisco Jiménez 2ºDAM");
        Alumnos a8 = new Alumnos("Dani Lopez 2ºDAM");
        Alumnos a9 = new Alumnos("David Pacheco 2ºDAM");
        Alumnos a10 = new Alumnos("Manolo Muñoz 2ºDAM");
        Alumnos a11 = new Alumnos("Mario Gonzalez 2ºDAM");

        Alumnos b1 = new Alumnos("Ivan Gonzalez 1ºDAM");
        Alumnos b2 = new Alumnos("Jose Perez 1ºDAM");
        Alumnos b3 = new Alumnos("Angel Rodriguez 1ºDAM");
        Alumnos b4 = new Alumnos("Daniel Martin 1ºDAM");
        Alumnos b5 = new Alumnos("Jesus Jimenez 1ºDAM");
        Alumnos b6 = new Alumnos("Adrian Ramos 1ºDAM");
        Alumnos b7 = new Alumnos("Ramon Urbano 1ºDAM");
        
        Alumnos c1 = new Alumnos("Alvaro Perez 1ºSMR");
        Alumnos c2 = new Alumnos("Pablo Rodriguez 1ºSMR");
        Alumnos c3 = new Alumnos("Marcos Martinez 1ºSMR");
        Alumnos c4 = new Alumnos("Hugo Pacheco 1ºSMR");
        Alumnos c5 = new Alumnos("Adrian Lopez 1ºSMR");
        
        Alumnos d1 = new Alumnos("Daniel Perez 2ºSMR");
        Alumnos d2 = new Alumnos("Adrian Lopez 2ºSMR");
        Alumnos d3 = new Alumnos("Mario Martin 2ºSMR");
        Alumnos d4 = new Alumnos("David Muñoz 2ºSMR");
        Alumnos d5 = new Alumnos("Francisco Ariza 2ºSMR");
        

    
        
        nombre_cursosAlumnos.setCellValueFactory(cellData -> cellData.getValue().todoProperty());
        
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
        alumnos.add(a7);
        alumnos.add(a8);
        alumnos.add(a9);
        alumnos.add(a10);
        alumnos.add(a11);
        alumnos.add(b1);
        alumnos.add(b2);
        alumnos.add(b3);
        alumnos.add(b4);
        alumnos.add(b5);
        alumnos.add(b6);
        alumnos.add(b7);
        alumnos.add(c1);
        alumnos.add(c2);
        alumnos.add(c3);
        alumnos.add(c4);
        alumnos.add(c5);
        alumnos.add(d1);
        alumnos.add(d2);
        alumnos.add(d3);
        alumnos.add(d4);
        alumnos.add(d5);
        tabla.setItems(alumnos);
    }    
    
    private ArrayList <String> cursos;
//    private ArrayList <String> alumnos;
    private ArrayList <String> fecha;

    public Ventana1Controller() {
        ArrayList<String> cursos = new ArrayList<>();
        ArrayList<String> alumnos = new ArrayList<>();
        ArrayList <String> fecha = new ArrayList<>();
        
    }

    public Ventana1Controller(ArrayList<String> cursos, ArrayList<String> alumnos, ArrayList<String> fecha, ArrayList<Alumnos> personas) {
        this.cursos = cursos;
//        this.alumnos = alumnos;
        this.fecha = fecha;
        personas = new ArrayList<>();
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    
    public ArrayList<String> getFecha() {
        return fecha;
    }

    public void setFecha(ArrayList<String> fecha) {
        this.fecha = fecha;
    }
    public void setMainApp(Justificador mainApp)
    {
        this.mainApp=mainApp;
    }
    @FXML
    private void mostrarSegunda(){
        Justificador.llamarSegundaVentana();
    }
    
    public void rellenaralumnos(ArrayList<String> alumnos){
        for (int i = 0; i<alumnos.size()+1; i++) {
            
        }
    }
}
