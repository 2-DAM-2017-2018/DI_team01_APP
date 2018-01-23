/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador;

import Datos.Alumnos;
import Datos.AlumnosFaltas;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author ITP1DAM
 */
public class Justificador extends Application {

    private static Stage primaryStage;
    private AnchorPane rootLayout;
    private AnchorPane rootLayout2;
    private static ObservableList<Alumnos> alumnos = FXCollections.observableArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }
    
    public ObservableList<Alumnos> getAlumnos() {
        return alumnos;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Control Asistencia Alumnos");
        initRootLayout();
    }

    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Justificador.class.getResource("Ventana2.fxml"));
            rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            Ventana2Controller controlador = loader.getController();
            controlador.setMainApp(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public  void mostrarDatosAlumno(Alumnos alumno,ObservableList<AlumnosFaltas> faltas) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Justificador.class.getResource("Ventana3.fxml"));
            rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            Ventana3Controller controlador = loader.getController();
            controlador.setMainApp(this);
            controlador.setAlumno(alumno);
            controlador.setFaltas(faltas);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


