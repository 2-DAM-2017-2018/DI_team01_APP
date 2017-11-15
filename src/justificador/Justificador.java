/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador;

import java.io.IOException;
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
    private Stage primaryStage;
    private AnchorPane rootLayout;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("Control Asistencia Alumnos");
        initRootLayout();
    }
    
    public void initRootLayout(){
        try{
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(Justificador.class.getResource("Ventana1.fxml"));
            rootLayout=(AnchorPane) loader.load();
            
            Scene scene=new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            Ventana1Controller controlador=loader.getController();
            controlador.setMainApp(this);
            
            primaryStage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
