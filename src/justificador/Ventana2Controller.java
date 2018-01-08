/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justificador;

import Datos.Asignaturas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author ITP1DAM
 */
public class Ventana2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
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
        
        
        
        
    }   
    
    
}
