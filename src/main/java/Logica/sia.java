/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Logica;
import UI.*;
import Datos.*;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author juan manuel
 */
public class sia {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        ArrayList usuarios_estudiante = new ArrayList<Estudiante>(); 
        ArrayList usuarios_profesor = new ArrayList<Profesor>();
        usuarios_profesor.add(new Profesor());
        ArrayList usuarios_papitos = new ArrayList<Papito>();
        
        
        
        //Generando objetos para probar el sistema:
        for(int i= 0; i< 10; i++){
            usuarios_papitos.add(new Papito());
        }
        
        for(int j=0; j<5; j++){
            usuarios_profesor.add(new Profesor());
        }
        
        for(int k=0; k<20; k++){
            usuarios_estudiante.add(new Estudiante());
        }
        
        /*
        Profesor est_prueb1 = (Profesor) usuarios_profesor.get(3);
        Papito est_prueb2 = (Papito) usuarios_papitos.get(4);
        est_prueb1.setNombre("Arcenio Pecha");
        est_prueb2.setNombre("Padre Cardenas");
        
        int id_1 = est_prueb1.getID();
        String clave_1 = est_prueb1.getClave();
        
        int id_2 = est_prueb2.getID();
        String clave_2 = est_prueb2.getClave();
        
        
        System.out.println("Datos para prueba "+ est_prueb1.getNombre() +"\n id: " +id_1  + "\n clave: " + clave_1);
        System.out.println("Datos para prueba "+ est_prueb2.getNombre() +"\n id: " +id_2  + "\n clave: " + clave_2);
        
        
        Prueba del sistema de login exitosa
        */
        
        /*
        System.out.println("Hola parfavar ingresa ID:");
        
        Scanner sc = new Scanner (System.in);
        Scanner sd = new Scanner (System.in);
        int id_usuario = sc.nextInt();
        System.out.println("Ahora la clave");
        String clave_usuario = sd.nextLine();


        
        if( id_usuario <= 200){
            //busca entre profesores
      
            buscarProfesor(usuarios_profesor, id_usuario, clave_usuario );
          
        }
        
        if(id_usuario > 200 && id_usuario < 500){
            //busca entre papito
            buscarPapito(usuarios_papitos, id_usuario, clave_usuario );
        }
        
        if(id_usuario >=600 && id_usuario <= 800){
            //busca entre estudianto
            buscarEstudiante(usuarios_estudiante, id_usuario, clave_usuario );
        }
        
        // TODO code application logic here
        */
    }
    
  
}
