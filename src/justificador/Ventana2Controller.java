/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador;

import Datos.Alumnos;
import Datos.AlumnosFaltas;
import Datos.Asignaturas;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ITP1DAM
 */
public class Ventana2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox asignaturasRellenar;
    @FXML
    private ComboBox alumnosRellenar;
    private Justificador mainApp;
    @FXML
    private Stage dialogStage;
    
    @FXML
    private RadioButton boton1;
            
    @FXML
    private RadioButton boton2;
            
    @FXML
    private RadioButton boton5;
    private static Stage secondaryStage;
    private ObservableList<AlumnosFaltas> faltas;
    @FXML
    private TextField fecha;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList<Asignaturas> asignaturas = new ArrayList<>();
        faltas=FXCollections.observableArrayList();
        
        Asignaturas a1 = new Asignaturas ("SMR Aplicaciones Ofimáticas");
        Asignaturas a2 = new Asignaturas ("SMR FOL");
        Asignaturas a3 = new Asignaturas ("SMR MME");
        Asignaturas a4 = new Asignaturas ("SMR Redes Locales");
        Asignaturas a5 = new Asignaturas ("SMR Sistemas Monopuestos");
        
        Asignaturas b1 = new Asignaturas ("SMR2 Seguridad Informática");
        Asignaturas b2 = new Asignaturas ("SMR2 Sistemas Operativos en Red");
        Asignaturas b3 = new Asignaturas ("SMR2 APP Web");
        Asignaturas b4 = new Asignaturas ("SMR2 Servicios en Red");
        
        Asignaturas c1 = new Asignaturas ("DAM FOL");
        Asignaturas c2 = new Asignaturas ("DAM Entornos de Desarrollo");
        Asignaturas c3 = new Asignaturas ("DAM Lenguaje de Marcas");
        Asignaturas c4 = new Asignaturas ("DAM Programación");
        Asignaturas c5 = new Asignaturas ("DAM Base de Datos");
        Asignaturas c6 = new Asignaturas ("DAM Sistemas Informáticos");
        
        Asignaturas d1 = new Asignaturas("DAM2 EIE");
        Asignaturas d2 = new Asignaturas("DAM2 Acceso a Datos");
        Asignaturas d3 = new Asignaturas("DAM2 Desarrollo de interfaces");
        Asignaturas d4 = new Asignaturas("DAM2 PSP");
        Asignaturas d5 = new Asignaturas("DAM2 PMDM");
        Asignaturas d6 = new Asignaturas("DAM2 SGE");
        
        
        asignaturasRellenar.getItems().add(a1.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(a2.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(a3.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(a4.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(a5.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(b1.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(b2.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(b3.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(b4.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(c1.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(c2.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(c3.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(c4.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(c5.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(c6.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(d1.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(d2.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(d3.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(d4.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(d5.getNombreAsignaturas());
        asignaturasRellenar.getItems().add(d6.getNombreAsignaturas());
        
        Alumnos aa1 = new Alumnos("Alejandro Ariza 2ºDAM");
        Alumnos aa2 = new Alumnos("Felipe Perez 2ºDAM");
        Alumnos aa3 = new Alumnos("Dani Muñoz 2ºDAM");
        Alumnos aa4 = new Alumnos("Pedro Martin 2ºDAM");
        Alumnos aa5 = new Alumnos("Ismael Castañeda 2ºDAM");
        Alumnos aa6 = new Alumnos("Pepe Perez 2ºDAM");
        Alumnos aa7 = new Alumnos("Francisco Jiménez 2ºDAM");
        Alumnos aa8 = new Alumnos("Dani Lopez 2ºDAM");
        Alumnos aa9 = new Alumnos("David Pacheco 2ºDAM");
        Alumnos aa10 = new Alumnos("Manolo Muñoz 2ºDAM");
        Alumnos aa11 = new Alumnos("Mario Gonzalez 2ºDAM");

        Alumnos ba1 = new Alumnos("Ivan Gonzalez 1ºDAM");
        Alumnos ba2 = new Alumnos("Jose Perez 1ºDAM");
        Alumnos ba3 = new Alumnos("Angel Rodriguez 1ºDAM");
        Alumnos ba4 = new Alumnos("Daniel Martin 1ºDAM");
        Alumnos ba5 = new Alumnos("Jesus Jimenez 1ºDAM");
        Alumnos ba6 = new Alumnos("Adrian Ramos 1ºDAM");
        Alumnos ba7 = new Alumnos("Ramon Urbano 1ºDAM");
        
        Alumnos ca1 = new Alumnos("Alvaro Perez 1ºSMR");
        Alumnos ca2 = new Alumnos("Pablo Rodriguez 1ºSMR");
        Alumnos ca3 = new Alumnos("Marcos Martinez 1ºSMR");
        Alumnos ca4 = new Alumnos("Hugo Pacheco 1ºSMR");
        Alumnos ca5 = new Alumnos("Adrian Lopez 1ºSMR");
        
        Alumnos da1 = new Alumnos("Daniel Perez 2ºSMR");
        Alumnos da2 = new Alumnos("Adrian Lopez 2ºSMR");
        Alumnos da3 = new Alumnos("Mario Martin 2ºSMR");
        Alumnos da4 = new Alumnos("David Muñoz 2ºSMR");
        Alumnos da5 = new Alumnos("Francisco Ariza 2ºSMR");
        
        alumnosRellenar.getItems().add(aa1.getTodo());
        alumnosRellenar.getItems().add(aa2.getTodo());
        alumnosRellenar.getItems().add(aa3.getTodo());
        alumnosRellenar.getItems().add(aa4.getTodo());
        alumnosRellenar.getItems().add(aa5.getTodo());
        alumnosRellenar.getItems().add(aa6.getTodo());
        alumnosRellenar.getItems().add(aa7.getTodo());
        alumnosRellenar.getItems().add(aa8.getTodo());
        alumnosRellenar.getItems().add(aa9.getTodo());
        alumnosRellenar.getItems().add(aa10.getTodo());
        alumnosRellenar.getItems().add(aa11.getTodo());
        alumnosRellenar.getItems().add(ba1.getTodo());
        alumnosRellenar.getItems().add(ba2.getTodo());
        alumnosRellenar.getItems().add(ba3.getTodo());
        alumnosRellenar.getItems().add(ba4.getTodo());
        alumnosRellenar.getItems().add(ba5.getTodo());
        alumnosRellenar.getItems().add(ba6.getTodo());
        alumnosRellenar.getItems().add(ba7.getTodo());
        alumnosRellenar.getItems().add(ca1.getTodo());
        alumnosRellenar.getItems().add(ca2.getTodo());
        alumnosRellenar.getItems().add(ca3.getTodo());
        alumnosRellenar.getItems().add(ca4.getTodo());
        alumnosRellenar.getItems().add(ca5.getTodo());
        alumnosRellenar.getItems().add(da1.getTodo());
        alumnosRellenar.getItems().add(da2.getTodo());
        alumnosRellenar.getItems().add(da3.getTodo());
        alumnosRellenar.getItems().add(da4.getTodo());
        alumnosRellenar.getItems().add(da5.getTodo());
        
       
    }   

    void setMainApp(Justificador mainApp) {
        this.mainApp=mainApp;
    }
    public void setDialogStage(Stage dialogStage){
        
        this.dialogStage=dialogStage;
    }
    @FXML
    private void handleCancel(){
        dialogStage.close();
    }
    
    
    
    public void pulsar1(){
        boton2.setSelected(false);
        boton5.setScaleZ(0);
    }
    public void pulsar2(){
        boton1.setSelected(false);
        boton5.setSelected(false);
    }
    public void pulsar5(){
        boton1.setSelected(false);
        boton2.setSelected(false);
    }
    public void lanzarVentana3(){
        Alumnos alumno1=new Alumnos(alumnosRellenar.getValue().toString());
        mainApp.mostrarDatosAlumno(alumno1,faltas);
    }
    
    public void insertarFalta(){
        
        String tipo="";
        if(boton1.isSelected()){
            tipo="Falta";
        }
        if(boton2.isSelected()){
            tipo="Retraso";
        }
        
        AlumnosFaltas falta=new AlumnosFaltas(alumnosRellenar.getValue().toString(),asignaturasRellenar.getValue().toString(),fecha.getText(),tipo);
        faltas.add(falta);
    }
}
