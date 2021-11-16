/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.*;
import UI.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;

public class prueba {
    public static void main(String[] args){
   
    
    
    //CREACION MATERIAS DEL ESTUDIANTE
     Materia materiauno = new Materia();
     Materia materiados = new Materia();
     Materia materiatres = new Materia();
     ArrayList<Materia> x = new ArrayList<>(Arrays.asList(materiauno, materiados, materiatres));
    
    //CREACION ESTUDIAMTE
     Estudiante pruebasxd = new Estudiante();
     pruebasxd.setMateriasInscritas(x);
     
     consultas consultor = new consultas();
     impresiones impresor = new impresiones();
     
     int idEstEjemplo = pruebasxd.getID();
     //System.out.print(idEstEjemplo);
     
     // CREACION DE UN DICCIONARIO DE NOTAS
     Nota notaEjemplo = new Nota();
     System.out.println(notaEjemplo.getValor());
     HashMap <String, Nota> notasEjemplo = new HashMap();
     notasEjemplo.put(String.valueOf(idEstEjemplo), notaEjemplo);
     //System.out.print(x.get(0).getClass());
     //ArrayList<Materia> xd = pruebasxd.getMateriasInscritas();
     //System.out.print(pruebasxd.toString());
     
    // CREACION DE LOS GRUPOS EN LOS QUE ESTA EL ESTUDIANTE
    Grupo primero = new Grupo();
    Grupo segundo = new Grupo();
    Grupo tercero = new Grupo();
    
    primero.setNotasGrupo(notasEjemplo);
    segundo.setNotasGrupo(notasEjemplo);
    tercero.setNotasGrupo(notasEjemplo);
    ArrayList al = new ArrayList<Grupo>();
    al.add(primero);
    al.add(segundo);
    al.add(tercero);    
    /*for(Object grupo : al){
            Grupo xd = (Grupo) grupo;
            
        }*/
     pruebasxd.setAtiende(al);
    // CREACION DE UN PAPITO
    Papito papitoEjemplo = new Papito();
    ArrayList acudea = new ArrayList();
    acudea.add(pruebasxd);
    papitoEjemplo.setAcudeA(acudea);
     //System.out.print(primero.getNotasGrupo());
     //System.out.print(segundo.getNotasGrupo().get(String.valueOf(idEstEjemplo)));
     //System.out.print(tercero.getNotasGrupo());
     //System.out.println("xd");
     //System.out.print(al);
     
    //CREACION DE UN PROFE
    Profesor profePrueba = new Profesor();
    profePrueba.setCursos(al);
    ArrayList<ArrayList> salida = consultor.consultarProfes(papitoEjemplo);
     //ArrayList<Profesor> salida = consultor.consultarProfes(pruebasxd);
    //impresor.mostrarNotas(salida);
    impresor.mostrarProfesPapitos(salida);
    //System.out.println(salida.size());
   // impresor.mostrarProfes(salida);
     /*PRUEBAS CON ARRAYLIST
    ArrayList xd = new ArrayList();
    xd.add("hola");
    xd.add(1);
    int n = xd.size();
    System.out.println(xd);*/
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
