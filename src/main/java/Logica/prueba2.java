/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Logica;
import Logica.consultas;
import Datos.*;
import java.util.ArrayList;
/**
 *
 * @author juan manuel
 */
public class prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Pruebas para subsidio:
   consultas prueba_consultas = new consultas();
   
   Subsidio sub_prueba = new Subsidio("A",456.780,2);
   Subsidio sub_prueba2= new Subsidio("B",100.233,1);
   
   ArrayList listaSubs = new ArrayList<Subsidio>();
   ArrayList lista_mat = new ArrayList<Materia>();
   ArrayList lista_est = new ArrayList<Estudiante>();
   listaSubs.add(sub_prueba);
   listaSubs.add(sub_prueba2);
   //System.out.println(listaSubs);
   Estudiante e = new Estudiante();
   Papito alberto = new Papito();
                                                        //"carlos",23,alberto,lista_mat,listaSubs
   Estudiante estudianto_prueba = new Estudiante("carlos",23,alberto,lista_mat,listaSubs);
                                                   
        System.out.println("Archivo prueba2");
       
   System.out.println(prueba_consultas.consultarSubsidio(estudianto_prueba));
  

    }
    
   
}
