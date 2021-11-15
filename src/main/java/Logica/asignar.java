/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Logica;
import Datos.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author juan manuel
 */
public class asignar {
//esto no es relevante
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    //Nota sobre este metodo: ya deberían existir 3 objetos de subsidios, de modo que se unan al mismo objeto los estudiantes.
    //Objetos definidos:

    Subsidio tipoA = new Subsidio("A", 450.340, 2);
    Subsidio tipoB = new Subsidio("B", 100.340, 1);
    Subsidio tipoC = new Subsidio("C", 320.340, 3);

    public boolean asignarSubsidio(Estudiante solicitante, Subsidio tipo) {

        // Parte estudiante
        ArrayList<Subsidio> subsidiosDelEstudiante = solicitante.getSubsidios();
        subsidiosDelEstudiante.add(tipo);
        solicitante.setSubsidios(subsidiosDelEstudiante);
        //Parte Subsidio
        ArrayList<Estudiante> solicitantesSubsidio = tipo.getBeneficiarios();
        solicitantesSubsidio.add(solicitante);
        tipo.setBeneficiarios(solicitantesSubsidio);

        return true;

    }
    
    public ArrayList<Nota> asignarNota(Grupo grupo_asignar){
       Scanner sc = new Scanner (System.in);
       ArrayList comprobante_notas = new ArrayList<Nota>();
        
     HashMap  notas_Grupales = new HashMap <String, Object> ();
        ArrayList<Estudiante> alumnos_por_Calificar = grupo_asignar.getEstudiantes();
        
        for (Estudiante alumno: alumnos_por_Calificar){
            System.out.println("Introduzca Nota del estudiante: " + alumno.getNombre());
            int calificacion = sc.nextInt();
            Nota nota = new Nota(calificacion,alumno);
            String nombre = alumno.getNombre();
            notas_Grupales.put(nombre, nota);
            comprobante_notas.add(nota);
        }
        
        grupo_asignar.setNotasGrupo(notas_Grupales);
        return comprobante_notas;
    }
    
    //Para cambiar notas es necesario el documento del estudiante, y el grupo
    public ArrayList<Nota> cambiarNota(Grupo grupo_asignar, int ID_solicitante) {
        Scanner sc = new Scanner(System.in);
        ArrayList comprobante_notas = new ArrayList<Nota>();
        Estudiante solicitante = new Estudiante();
        HashMap notas_Grupales = grupo_asignar.getNotasGrupo();
        ArrayList<Estudiante> alumnos_por_Calificar = grupo_asignar.getEstudiantes();
        
        //´primero hallamos el estudiante al cual le cambiaremos la nota, dentro de los estudiantes del grupo
        for (Estudiante alumnos: alumnos_por_Calificar){
            if(alumnos.getID()== ID_solicitante){
                solicitante = alumnos;
            }
        }
        
        //despues si le cambiamos la nota. Para esto tenemos que eliminar la nota actual, y reemplazarla con la nueva

        for (Estudiante alumno : alumnos_por_Calificar) {
            if (alumno == solicitante) {
                notas_Grupales.remove(alumno);
                System.out.println("Cambiar la  Nota del estudiante: " + alumno.getNombre());
                int calificacion = sc.nextInt();
                Nota nota = new Nota(calificacion, alumno);
                String nombre = alumno.getNombre();
                notas_Grupales.put(nombre, nota);
                comprobante_notas.add(nota);
            }

        }
        
        grupo_asignar.setNotasGrupo(notas_Grupales);
        return comprobante_notas;
    }
    
    
}
