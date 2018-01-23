/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador;

import Datos.Alumnos;
import Datos.AlumnosFaltas;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ITP1DAM
 */
public class Ventana3Controller implements Initializable {
    
    private Justificador mainApp;
    private Alumnos alumno;
    @FXML
    private Label datosAlumno;
    //@FXML
    //private TableColumn columnaAsignatura;
    @FXML
    private TableColumn<AlumnosFaltas,String> columnaFaltas;
    @FXML
    private TableColumn<AlumnosFaltas,String> columnaRetrasos;
    @FXML
    private TableColumn<AlumnosFaltas,String> columnaFecha;
    
    @FXML
    private TableColumn<AlumnosFaltas,String>  columnaAsignatura;
    @FXML
    private TableView tabla;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    void setMainApp(Justificador mainApp) {
        this.mainApp=mainApp;
    }
    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
        datosAlumno.setText(alumno.getTodo().toString());
        
    }
    public void setFaltas(ObservableList<AlumnosFaltas> faltas){
        /**
         * Aquí esta el metodo donde falta mostrar los datos
         */
            
            tabla.setItems( faltas);
        
        
        
            
        
        
    }
    
    
}
