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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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
    private TableColumn<AlumnosFaltas,String> columnaAsignatura;
    @FXML
    private TableColumn<AlumnosFaltas,String> columnaTipoFalta;
    @FXML
    private TableColumn<AlumnosFaltas,String> columnaFecha;
    
    
    @FXML
    private TableView tabla;
    @FXML
    private Button bEliminar;
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        columnaAsignatura.setCellValueFactory(cellData -> cellData.getValue().asignaturaProperty());
        columnaTipoFalta.setCellValueFactory(cellData -> cellData.getValue().tipo());
        columnaFecha.setCellValueFactory(cellData -> cellData.getValue().fechaProperty());
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
            
            tabla.setItems(faltas);
       
    }
    @FXML
    private void borrarFalta() {
        int selectedIndex = tabla.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            tabla.getItems().remove(selectedIndex);
        } else {
            // Nothing selected.
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No hay ningun alumno seleccionado");
            alert.setHeaderText("No alumn selected");
            alert.setContentText("Please select a alum in the table.");

            alert.showAndWait();
        }
    }
    
    
}
