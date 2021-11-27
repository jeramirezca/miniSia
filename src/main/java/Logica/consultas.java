/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Datos.*;
import java.util.ArrayList;
import java.util.HashMap;

public class consultas {
    
    public ArrayList<String> consultarNotas(Estudiante estudiante, Materia asignatura){
        String id = String.valueOf(estudiante.getID());
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
    
    //codigo de simon
    public ArrayList<String> consultarNotas(Estudiante estudiante){
        String id = String.valueOf(estudiante.getID());
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
            cadena += String.join(" ", consultarNotas(estudiante)); 
            notasEstudiantes.add(cadena);
           
        } 
        
        return notasEstudiantes;
    }
    

    
 //codigo de simon
    public ArrayList<String> recorrerArregloHorario(ArrayList<Grupo> grupos){
        ArrayList<String> horario = new ArrayList();
        for(Object grupo : grupos){
            Grupo grupoObjeto = (Grupo) grupo;
            String nombreMateria = grupoObjeto.getAsignatura().getNombre();
            String horarioMateria = String.join(", ", grupoObjeto.getHorario());
            String calendario = nombreMateria + " " + horarioMateria;
            horario.add(calendario);
        }
        return horario;
    }
    
    public ArrayList<String> consultarHorario(Estudiante estudiante){
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        ArrayList<String> horario = recorrerArregloHorario(grupos);
        String cadena = "HORARIO ESTUDIANTE: ";
        horario.add(0,cadena);      
        return horario;
        
    }
    
    //codigo de simon
    public ArrayList<String> consultarHorario(Profesor profe){
        ArrayList<Grupo> grupos = profe.getCursos();
        ArrayList<String> horario = recorrerArregloHorario(grupos);
        String cadena = "HORARIO PROFE: ";
        horario.add(0,cadena);      
        return horario;       
    }
    
    public ArrayList<String> consultarHorario(Papito acudiente){
        ArrayList<Estudiante> acudidos = acudiente.getAcudeA();
        ArrayList<String> horarioEstudiantes = new ArrayList();
        for(Object objeto:acudidos){
            Estudiante estudiante = (Estudiante) objeto;
            String cadena = estudiante.getNombre() + ": ";
            cadena += String.join(" ", consultarHorario(estudiante)); 
            horarioEstudiantes.add(cadena);          
        }    
        return horarioEstudiantes;
    }
    
    //codigo de simon
    public ArrayList<Profesor> consultarProfes(Estudiante estudiante){
        ArrayList<Profesor> profesores = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        for(Object grupo : grupos){
            Grupo grupoEstudiante = (Grupo) grupo;
            Profesor profe = grupoEstudiante.getProfesor();
            profesores.add(profe);
        }    
        return profesores;
    }
    
    public ArrayList<ArrayList> consultarProfes(Papito acudiente){
        ArrayList<Estudiante> acudidos = acudiente.getAcudeA();
        ArrayList<ArrayList> profesYestudiantes = new ArrayList();
        for(Object objeto:acudidos){            
            Estudiante estudiante = (Estudiante) objeto;
            ArrayList lista = new ArrayList();
            String nombreEstudiante = estudiante.getNombre() + ": ";
            lista.add(nombreEstudiante);
            ArrayList<Profesor> profesores = consultarProfes(estudiante); 
            lista.add(profesores);
            profesYestudiantes.add(lista);
        }    
        return profesYestudiantes;
    }
    
    
    //codigo mio
    public String consultarSubsidio(Estudiante consultor) {
        String respuesta = "";

        if (consultor.getSubsidios().isEmpty()) {
            respuesta = "Usted no tiene subsidios asignados";
        } else {
            ArrayList<Subsidio> Lista_subsidios = consultor.getSubsidios();

            for (Subsidio i : Lista_subsidios) {
                //String elemento = " ";
                int j = 1;
                String valor_monetario = String.valueOf(i.getValor());
                String duracion = String.valueOf(i.getDuracionSemestres());
                String personas_usando = String.valueOf(i.getBeneficiarios().size());

                respuesta += "\nSUBSIDIO" + j + ":"
                        + " \nTipo: " + i.getTipo()
                        + " \nValor asignado: " + valor_monetario
                        + " \nDuracion semestral: " + duracion
                        + " \nPersonas usando este subsidio: " + personas_usando;

                //respuesta.add(elemento);
                j ++;
            }

        }
        return respuesta;
    }
    
/*
    //MEtodo 1: con estudiante y documento del profesor
    public String consultarProfesor(int documento_profe,Estudiante consultor){
        String respuesta = " ";
        Profesor consultado = new Profesor();
  
        //Si solo tenemos el documento, buscaremos en los grupos del estudiante el profesor que le coincida el documento
        for( Grupo grupo_estudiante : consultor.getAtiende()){
            Profesor buscando = grupo_estudiante.getProfesor();
            if(buscando.getID() == documento_profe) {
                consultado = buscando;
                
            }
        }
        
        respuesta += "Nombre: " + consultado.getNombre()+
                "\n Edad: "+ consultado.getEdad()+
                "\n Email: "+ consultado.getEmail()
                +"\n Grupos dictados: " + consultado.getCursos() ; 
         
        return respuesta;
    }
    
    //Metodo 2: con grupo
        public String consultarProfesor(Grupo grupo_consultor){
        String respuesta = " ";
        Profesor consultado = grupo_consultor.getProfesor();
  
     
        
        respuesta += "Nombre: " + consultado.getNombre()+
                "\n Edad: "+ consultado.getEdad()+
                "\n Email: "+ consultado.getEmail()
                +"\n Grupos dictados: " + consultado.getCursos() ; 
         
        return respuesta;
    
    }
*/
    
    public Grupo buscarGrupo (Estudiante consultor, int numero){
        Grupo encontrado = new Grupo();
        ArrayList<Grupo> gruposEstudiante = consultor.getAtiende();
        for(Grupo buscando: gruposEstudiante){
            if(buscando.getNumero()== numero){
                encontrado =  buscando;
            }
        }
        return encontrado;
    }

}
