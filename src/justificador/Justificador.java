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

    /**
     * @param args the command line arguments
     */
    
    
    
    
    private static ArrayList<Alumnos> alumnos;

    public static void rellenarDatos() {
        alumnos = new ArrayList<>();

        Alumnos a1 = new Alumnos("Alejandro", "Ariza", "2ºDAM");
        alumnos.add(a1);
        Alumnos a2 = new Alumnos("Felipe", "Perez", "2ºDAM");
        alumnos.add(a2);
        Alumnos a3 = new Alumnos("Dani", "Muñoz", "2ºDAM");
        alumnos.add(a3);
        Alumnos a4 = new Alumnos("Pedro", "Martin", "2ºDAM");
        alumnos.add(a4);
        Alumnos a5 = new Alumnos("Ismael", "Castañeda", "2ºDAM");
        alumnos.add(a5);
        Alumnos a6 = new Alumnos("Pepe", "Perez", "2ºDAM");
        alumnos.add(a6);
        Alumnos a7 = new Alumnos("Francisco", "Jiménez", "2ºDAM");
        alumnos.add(a7);
        Alumnos a8 = new Alumnos("Dani", "Lopez", "2ºDAM");
        alumnos.add(a8);
        Alumnos a9 = new Alumnos("David", "Pacheco", "2ºDAM");
        alumnos.add(a9);
        Alumnos a10 = new Alumnos("Manolo", "Muñoz", "2ºDAM");
        alumnos.add(a10);
        Alumnos a11 = new Alumnos("Mario", "Gonzalez", "2ºDAM");
        alumnos.add(a11);

        Alumnos b1 = new Alumnos("Ivan", "Gonzalez", "1ºDAM");
        alumnos.add(b1);
        Alumnos b2 = new Alumnos("Jose", "Perez", "1ºDAM");
        alumnos.add(b2);
        Alumnos b3 = new Alumnos("Angel", "Rodriguez", "1ºDAM");
        alumnos.add(b3);
        Alumnos b4 = new Alumnos("Daniel", "Martin", "1ºDAM");
        alumnos.add(b4);
        Alumnos b5 = new Alumnos("Jesus", "Jimenez", "1ºDAM");
        alumnos.add(b5);
        Alumnos b6 = new Alumnos("Adrian", "Ramos", "1ºDAM");
        alumnos.add(b6);
        Alumnos b7 = new Alumnos("Ramon", "Urbano", "1ºDAM");
        alumnos.add(b7);

        Alumnos c1 = new Alumnos("Alvaro", "Perez", "1ºSMR");
        alumnos.add(c1);
        Alumnos c2 = new Alumnos("Pablo", "Rodriguez", "1ºSMR");
        alumnos.add(c2);
        Alumnos c3 = new Alumnos("Marcos", "Martinez", "1ºSMR");
        alumnos.add(c3);
        Alumnos c4 = new Alumnos("Hugo", "Pacheco", "1ºSMR");
        alumnos.add(c4);
        Alumnos c5 = new Alumnos("Adrian", "Lopez", "1ºSMR");
        alumnos.add(c5);

        Alumnos d1 = new Alumnos("Daniel", "Perez", "2ºSMR");
        alumnos.add(d1);
        Alumnos d2 = new Alumnos("Adrian", "Lopez", "2ºSMR");
        alumnos.add(d2);
        Alumnos d3 = new Alumnos("Mario", "Martin", "2ºSMR");
        alumnos.add(d3);
        Alumnos d4 = new Alumnos("David", "Muñoz", "2ºSMR");
        alumnos.add(d4);
        Alumnos d5 = new Alumnos("Francisco", "Ariza", "2ºSMR");
        alumnos.add(d5);

    }

    public static void main(String[] args) {

        launch(args);
        rellenarDatos();
        
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


