/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;

public class prueba {
    public static void main(String[] args){
    // CREACION DE LOS GRUPOS EN LOS QUE ESTA EL ESTUDIANTE
    Grupo primero = new Grupo(new Profesor(),2);
    Grupo segundo = new Grupo();
    Grupo tercero = new Grupo();
    ArrayList al = new ArrayList<Grupo>();
    al.add(primero);
    al.add(segundo);
    al.add(tercero);    
    /*for(Object grupo : al){
            Grupo xd = (Grupo) grupo;
            
        }*/
    //CREACION MATERIAS DEL ESTUDIANTE
     Materia materiauno = new Materia();
     Materia materiados = new Materia();
     Materia materiatres = new Materia();
     ArrayList<Materia> x = new ArrayList<>(Arrays.asList(materiauno, materiados, materiatres));
    
    //CREACION ESTUDIAMTE
     Estudiante pruebasxd = new Estudiante();
     //pruebasxd.setMateriasInscritas(x);
     //System.out.print(x.get(0).getClass());
     //ArrayList<Materia> xd = pruebasxd.getMateriasInscritas();
     //System.out.print(pruebasxd.toString());
     //pruebasxd.setAtiende(al);
     //ArrayList<String> salida = consultarNotas(pruebasxd);
    
     //PRUEBAS CON ARRAYLIST
    ArrayList xd = new ArrayList();
    //xd.add("hola");
    //xd.add(1);
    System.out.println(pruebasxd.toString());
    pruebasxd.setNombre("Simonxd");
    xd.add(pruebasxd);
    int n = xd.size();
    System.out.println(xd.get(0).toString());
    
    
    }
    
    

    
    /*public ArrayList<Nota> consultarNotas(Estudiante estudiante){
        int id = estudiante.getID();
        ArrayList notasEstudiante = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        HashMap notasDelGrupo;
        for(Object grupo : grupos){
            Grupo grupoDelEstudante = (Grupo) grupo;
            notasDelGrupo = grupoDelEstudante.getNotasGrupo();
            Nota notaEstudiante = (Nota) notasDelGrupo.get(id);
            notasEstudiante.add(notaEstudiante); 
        }
        return notasEstudiante;
    }*/
     
     /*public ArrayList<Nota> conultarNotas(Estudiante estudiante, Materia asignatura){
        int id = estudiante.getID();
        ArrayList notaEstudiante = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        int i = 0;
        int n = grupos.size();
        boolean bandera = true;
        while(i<n && bandera){
            if( grupos.get(i).getAsignatura() == asignatura) {
                HashMap notas = grupos.get(i).getNotasGrupo();
                notaEstudiante.add(notas.get(id));
                bandera = false;
            }
            i ++;
        }
        
        return notaEstudiante;  
    }*/
    
}
