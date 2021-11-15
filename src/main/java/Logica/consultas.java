/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Datos.*;
import java.util.ArrayList;
import java.util.HashMap;

public class consultas {
    
    public  ArrayList<String> consultarNotas(Estudiante estudiante, Materia asignatura){
        int id = estudiante.getID();
        ArrayList notaEstudiante = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        int i = 0;
        int n = grupos.size();
        boolean bandera = true;
        while(i<n && bandera){
            if( grupos.get(i).getAsignatura() == asignatura) {
                HashMap notas = grupos.get(i).getNotasGrupo(); 
                Nota nota = (Nota) notas.get(id);
                String aniadido = "Materia: " + asignatura.getNombre() + 
                        nota.toString();
                notaEstudiante.add(aniadido);
                bandera = false;
            }
            i ++;
        }
        
        return notaEstudiante;  
    }
    public ArrayList<String> consultarNotas(Estudiante estudiante){
        int id = estudiante.getID();
        ArrayList notasEstudiante = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        HashMap notasDelGrupo;
        for(Object grupo : grupos){
            Grupo grupoDelEstudiante = (Grupo) grupo;
            notasDelGrupo = grupoDelEstudiante.getNotasGrupo();
            Nota notaEstudiante = (Nota) notasDelGrupo.get(id);
            String aniadido = "Materia: " + grupoDelEstudiante.getAsignatura().getNombre()
                    + notaEstudiante.toString();
            notasEstudiante.add(aniadido); 
        }
        return notasEstudiante;
    }
    
    public ArrayList<String> consultarNotas(Papito acudiente){
        ArrayList<Estudiante> acudidos = acudiente.getAcudeA();
        ArrayList<String> notasEstudiantes = new ArrayList();
        for(Object objeto:acudidos){
            Estudiante estudiante = (Estudiante) objeto;
            String cadena = estudiante.getNombre() + ": ";
            cadena += consultarNotas(estudiante); 
            notasEstudiantes.add(cadena);
           
        } 
        
        return notasEstudiantes;
    }
    
    public  String consultarSubsidio(Estudiante consultor){
     String respuesta = " ";
    
    if(consultor.getSubsidios().isEmpty()) respuesta ="Usted no tiene subsidios asignados";
    else{
        ArrayList<Subsidio> Lista_subsidios = consultor.getSubsidios();
        
        for (Subsidio i : Lista_subsidios) {
            //String elemento = " ";
            String valor_monetario = String.valueOf(i.getValor());
            String duracion = String.valueOf(i.getDuracionSemestres());
            String personas_usando = String.valueOf(i.getBeneficiarios().size());
            
            respuesta += "\n"
                    +"Tipo: "+ i.getTipo()
                    + " \n Valor asignado: " + valor_monetario
                    + " \n Duracion semestral: " + duracion
                    + "\n Personas usando este subsidio: " + personas_usando
                    +"\n";
            
            //respuesta.add(elemento);
          
        }
    }
    return respuesta;
}
  
    
}
