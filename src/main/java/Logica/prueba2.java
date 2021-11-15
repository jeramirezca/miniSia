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
        
          ArrayList lista_mat = new ArrayList<Materia>();
   ArrayList lista_est = new ArrayList<Estudiante>();
        //Pruebas para subsidio:
   consultas prueba_consultas = new consultas();
   asignar prueba_asignar = new asignar();
   
    Subsidio tipoA = new Subsidio("A", 450.340, 2);
    Subsidio tipoB = new Subsidio("B", 100.340, 1);
    Subsidio tipoC = new Subsidio("C", 320.340, 3);
    
    Estudiante e = new Estudiante();
    Papito alberto = new Papito();
    System.out.println("Archivo prueba2");
    Estudiante estudianto_prueba = new Estudiante("carlos",23,alberto,lista_mat);
 

   
                                                  
   System.out.println("Asignar subsidio tipo A a:  "+estudianto_prueba.getNombre()+ " Resultado: "+ prueba_asignar.asignarSubsidio(estudianto_prueba, tipoA));
   System.out.println("Asignar subsidio tipo A a:  "+e.getNombre()+ " Resultado: "+ prueba_asignar.asignarSubsidio(e, tipoA));
   System.out.println(tipoA);   
   
   System.out.println(prueba_consultas.consultarSubsidio(estudianto_prueba));
   System.out.println(prueba_consultas.consultarSubsidio(e));
  
  //Resultado de la prueba, sirve a la perfección asignar y consultar subsidio.
    }
    
   
}
