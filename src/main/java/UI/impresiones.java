/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;
import Datos.*;
import java.util.ArrayList;
import java.util.HashMap;

public class impresiones {
    public void mostrarNotas(ArrayList<String> consultas){
    for(String consulta : consultas){
        System.out.print(consulta + " ");
        }  
    }
    
    public void mostrarProfes(ArrayList<Profesor> profes){
        System.out.println("Los profesores del estudiante son: ");
        for(Object profe : profes){
        Profesor profesor = (Profesor) profe;
        System.out.println(profesor.toString());
        }
    }
    
    public void mostrarProfesPapitos(ArrayList<ArrayList> profesYestudiantes){
        for(int i=0; i<profesYestudiantes.size(); i++){
            System.out.println(profesYestudiantes.get(i).get(0));
            ArrayList<Profesor> profes = 
                    (ArrayList<Profesor>) profesYestudiantes.get(i).get(1);
            mostrarProfes(profes);

        }
    }
   
    public void imprimirObjeto (Estudiante estudiante){
        String cadena = estudiante.toString();
        System.out.println(cadena);
    }
    
    public void imprimirObjeto (Grupo grupo){
        String cadena = grupo.toString();
        System.out.println(cadena);
    }
    public void imprimirObjeto (Materia materia){
        String cadena = materia.toString();
        System.out.println(cadena);
    }
    public void imprimirObjeto (Nota nota){
        String cadena = nota.toString();
        System.out.println(cadena);
    }
    public void imprimirObjeto (Papito papito){
        String cadena = papito.toString();
        System.out.println(cadena);
    }
    public void imprimirObjeto (Profesor profesor){
        String cadena = profesor.toString();
        System.out.println(cadena);
    }
    public void imprimirObjeto (Subsidio subsidio){
        String cadena = subsidio.toString();
        System.out.println(cadena);
    }
}
