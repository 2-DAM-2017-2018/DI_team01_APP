/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author ITP1DAM
 */
public class Asignaturas 
{
    private ArrayList<String> AsignaturasSMR;
    private ArrayList<String> AsignaturasSMR2;
    private ArrayList<String> AsignaturasDAM;
    private ArrayList<String> AsignaturasDAM2;

    public Asignaturas() {
    }

    public Asignaturas(ArrayList<String> AsignaturasSMR, ArrayList<String> AsignaturasDAM1, ArrayList<String> AsignaturasDAM2) {
        this.AsignaturasSMR = AsignaturasSMR;
        this.AsignaturasDAM = AsignaturasDAM1;
        this.AsignaturasDAM2 = AsignaturasDAM2;
    }

    public ArrayList<String> getAsignaturasSMR() {
        return AsignaturasSMR;
    }

    public void setAsignaturasSMR(ArrayList<String> AsignaturasSMR) {
        this.AsignaturasSMR = AsignaturasSMR;
    }

    public ArrayList<String> getAsignaturasDAM1() {
        return AsignaturasDAM;
    }

    public void setAsignaturasDAM1(ArrayList<String> AsignaturasDAM1) {
        this.AsignaturasDAM = AsignaturasDAM1;
    }

    public ArrayList<String> getAsignaturasDAM2() {
        return AsignaturasDAM2;
    }

    public void setAsignaturasDAM2(ArrayList<String> AsignaturasDAM2) {
        this.AsignaturasDAM2 = AsignaturasDAM2;
    }
    
    public void asignaturasSMR()
    {
        AsignaturasSMR = new ArrayList<>();
        
        AsignaturasSMR.add("Aplicaciones Ofimaticas");
        AsignaturasSMR.add("FOL");
        AsignaturasSMR.add("MME");
        AsignaturasSMR.add("Redes Locales");
        AsignaturasSMR.add("SistemasOperativos Monopuestos");
    }
    
    public void asignaturasSMR2()
    {
        AsignaturasSMR2 = new ArrayList<>();
        
        AsignaturasSMR2.add("Seguridad Informática");
        AsignaturasSMR2.add("Sistemas Operativos en Red");
        AsignaturasSMR2.add("App Web");
        AsignaturasSMR2.add("Servicios en Red");
    }
    
    public void asignaturasDAM()
    {
        AsignaturasDAM = new ArrayList<>();
        
        AsignaturasDAM.add("FOL");
        AsignaturasDAM.add("Entornos de Desarrollo");
        AsignaturasDAM.add("Lenguaje de Marcas");
        AsignaturasDAM.add("Programacion");
        AsignaturasDAM.add("Base de Datos");
        AsignaturasDAM.add("Sistemas Informaticos");
    }
    
    public void asignaturasDAM2()
    {
        AsignaturasDAM2 = new ArrayList<>();
        
        AsignaturasDAM2.add("Acceso a Datos");
        AsignaturasDAM2.add("Desarrollo de Interfaces");
        AsignaturasDAM2.add("EIE");
        AsignaturasDAM2.add("PSP");
        AsignaturasDAM2.add("PMDM");
        AsignaturasDAM2.add("Sistemas de Gestion empresarial");
    }
            
}
