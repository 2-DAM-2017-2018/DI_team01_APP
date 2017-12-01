/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador;

import Datos.Alumnos;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author ITP1DAM
 */
public class Justificador extends Application {

    private static Stage primaryStage;
    private AnchorPane rootLayout;
    private static ObservableList<Alumnos> alumnos = FXCollections.observableArrayList();

    /**
     * @param args the command line arguments
     */
    
    
    
    
    //private static ArrayList<Alumnos> alumnos;

    

    public static void main(String[] args) {

        launch(args);
       //rellenarDatos();
        
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
            loader.setLocation(Justificador.class.getResource("Ventana1.fxml"));
            rootLayout = (AnchorPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            Ventana1Controller controlador = loader.getController();
            controlador.setMainApp(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void llamarSegundaVentana() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Justificador.class.getResource("Ventana2.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Ventana2");
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            dialogStage.show();
        } catch (IOException e) {
            e.toString();
        }
    }
    

    

}


